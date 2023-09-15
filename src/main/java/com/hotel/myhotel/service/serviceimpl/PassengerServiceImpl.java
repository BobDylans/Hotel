package com.hotel.myhotel.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotel.myhotel.mapper.PassengerMapper;
import com.hotel.myhotel.pojo.Passenger;
import com.hotel.myhotel.service.PassengerService;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImpl extends ServiceImpl<PassengerMapper, Passenger> implements PassengerService {
}
