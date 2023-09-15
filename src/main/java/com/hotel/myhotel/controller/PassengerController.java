package com.hotel.myhotel.controller;

import com.hotel.myhotel.pojo.Passenger;
import com.hotel.myhotel.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassengerController {
    @Autowired
    private PassengerService passengerService;
    @GetMapping("/passenger/getAll")
    public List<Passenger> getAll(){
        return passengerService.list();
    }

}
