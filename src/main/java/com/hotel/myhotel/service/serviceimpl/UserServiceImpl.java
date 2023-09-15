package com.hotel.myhotel.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import com.hotel.myhotel.mapper.UserMapper;
import com.hotel.myhotel.pojo.Users;
import com.hotel.myhotel.service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, Users>implements UsersService {

    @Autowired
    private UserMapper userMapper;

}
