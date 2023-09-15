package com.hotel.myhotel.controller;

import com.hotel.myhotel.pojo.Room;

import com.hotel.myhotel.service.RoomService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/room")
@Api("房间接口")
public class RoomController {

    @Autowired
    private RoomService roomService;


    @GetMapping("/getAllRoom")
    @ApiOperation("获取全部房间信息")
    public List<Room> getAll(){
        return roomService.list();
    }
}
