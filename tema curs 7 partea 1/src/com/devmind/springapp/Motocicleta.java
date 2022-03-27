package com.devmind.springapp;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component("moto")
public class Motocicleta implements IAutomobil {

    @Autowired
    private Motor motor;

    @Override
    public String travel (){
        return "The moto travels for 100km";
    }

    @Override
    public int maxDrivingSpeed (){
        return 180;
    }
}
