package com.hotel.myhotel.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hotel.myhotel.common.Result;
import com.hotel.myhotel.common.StatusCode;
import com.hotel.myhotel.pojo.Passenger;
import com.hotel.myhotel.pojo.Room;
import com.hotel.myhotel.service.PassengerService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/passenger")
public class PassengerController {
    @Autowired
    private PassengerService passengerService;
    @GetMapping("/getAll")
    public List<Passenger> getAll(){
        return passengerService.list();
    }

    @GetMapping("/page")
    @ApiOperation("分页查询")
    public Result<Page> page(int page, int pageSize){
        log.info("page = {},pageSize = {}" ,page,pageSize);

        //构造分页构造器
        Page pageInfo = new Page(page,pageSize);

        //构造条件构造器
        LambdaQueryWrapper<Passenger> queryWrapper = new LambdaQueryWrapper();
        //添加过滤条件
//        queryWrapper.like(Room::getName,name);
        //添加排序条件
//        queryWrapper.orderByDesc(Employee::getUpdateTime);

        //执行查询
        passengerService.page(pageInfo,queryWrapper);

        return new Result<>(true, StatusCode.OK,"查询成功",pageInfo);
    }

}
