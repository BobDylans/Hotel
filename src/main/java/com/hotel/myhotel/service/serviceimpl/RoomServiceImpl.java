package com.hotel.myhotel.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotel.myhotel.mapper.RoomMapper;
import com.hotel.myhotel.pojo.Room;
import com.hotel.myhotel.service.RoomService;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl extends ServiceImpl<RoomMapper, Room> implements RoomService {
}
