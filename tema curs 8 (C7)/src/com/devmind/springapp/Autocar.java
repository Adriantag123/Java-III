package com.devmind.springapp;

import lombok.Data;

@Data
public class Autocar implements IAutomobil {

    private Motor motor;

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
