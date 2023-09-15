package com.hotel.myhotel.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotel.myhotel.pojo.Users;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<Users> {
}
