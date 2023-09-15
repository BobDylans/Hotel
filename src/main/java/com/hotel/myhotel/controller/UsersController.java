package com.hotel.myhotel.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.github.pagehelper.PageInfo;
import com.hotel.myhotel.common.Result;
import com.hotel.myhotel.common.StatusCode;
import com.hotel.myhotel.pojo.Users;
import com.hotel.myhotel.service.UsersService;
import com.hotel.myhotel.utils.ValidateCodeUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController("/users")
@Api("用户接口")
@Slf4j
public class UsersController {
    @Autowired
    UsersService usersService;

    @Autowired
    private RedisTemplate redisTemplate;
    @ApiOperation("查询所有用户")
    @GetMapping("/getAll")
    public List<Users> getAll(){
        return usersService.list();
    }

    @PostMapping("/sendMsg")
    @ApiOperation("发送短信")
    public Result<String> sendMsg(@RequestBody Users user, HttpSession session){
        //获取手机号
        String phone = user.getPhone();

        if((phone)!=""){
            //生成随机的4位验证码
            String code = ValidateCodeUtils.generateValidateCode(4).toString();
            log.info("code={}",code);

            //调用阿里云提供的短信服务API完成发送短信
            //SMSUtils.sendMessage("瑞吉外卖","",phone,code);

            //需要将生成的验证码保存到Session
            //session.setAttribute(phone,code);

            //将生成的验证码缓存到Redis中，并且设置有效期为5分钟
            redisTemplate.opsForValue().set(phone,code,5, TimeUnit.MINUTES);

            return new Result<>(true, StatusCode.OK, "发送成功");
        }

        return new Result<>(true, StatusCode.ERROR, "发送成功");
    }

    @PostMapping("/login")
    @ApiOperation("短信验证登录")
    public Result<Users> login(@RequestBody Map map, HttpSession session){
        log.info(map.toString());

        //获取手机号
        String phone = map.get("phone").toString();

        //获取验证码
        String code = map.get("code").toString();

        //从Session中获取保存的验证码
        //Object codeInSession = session.getAttribute(phone);

        //从Redis中获取缓存的验证码
        Object codeInSession = redisTemplate.opsForValue().get(phone);

        //进行验证码的比对（页面提交的验证码和Session中保存的验证码比对）
        if(codeInSession != null && codeInSession.equals(code)){
            //如果能够比对成功，说明登录成功

            LambdaQueryWrapper<Users> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.eq(Users::getPhone,phone);

            Users user = usersService.getOne(queryWrapper);
            if(user == null){
                //判断当前手机号对应的用户是否为新用户，如果是新用户就自动完成注册
                user = new Users();
                user.setPhone(phone);

                usersService.save(user);
            }
            session.setAttribute("user",user.getId());

            //如果用户登录成功，删除Redis中缓存的验证码
            redisTemplate.delete(phone);

            return new Result<>(true, StatusCode.OK, "发送成功",user);
        }
        return new Result<>(false,StatusCode.ERROR,"登陆失败");
    }


}
