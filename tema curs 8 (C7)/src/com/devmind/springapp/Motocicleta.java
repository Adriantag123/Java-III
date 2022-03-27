package com.devmind.springapp;

import lombok.Data;

@Data
public class Motocicleta implements IAutomobil {

    private Motor motor;
    private int superSpeed;

    @Override
    public String travel (){
        return "The moto travels for 100km";
    }

    @Override
    public int maxDrivingSpeed (){
        return 180;
    }

    public Motocicleta (){
    }
    public Motocicleta (Motor motor, int superSpeed){
        this.motor = motor;
        this.superSpeed = superSpeed;
    }
}
