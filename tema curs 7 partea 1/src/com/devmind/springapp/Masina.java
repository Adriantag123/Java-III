package com.devmind.springapp;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Masina implements IAutomobil {

    Motor motor;
    @Autowired
    public void setMotor(Motor motor){
        this.motor = motor;
    }

    @Override
    public String travel (){
        return "the masina travels for 300km";
    }
    @Override
    public int maxDrivingSpeed (){
        return 130;
    }
}
