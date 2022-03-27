package com.devmind.springapp;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Autocar implements IAutomobil {

    private Motor motor;
    @Autowired
    public Autocar(Motor motor){
        this.motor =  motor;
    }

    @Override
    public String travel (){
        return "the autocar travels for 600km";
    }
    @Override
    public int maxDrivingSpeed (){
        return 100;
    }
}
