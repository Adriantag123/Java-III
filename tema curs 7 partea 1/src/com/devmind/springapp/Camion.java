package com.devmind.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Camion {

    @Autowired
    @Qualifier("moto")
    IAutomobil camion;

    public void printSpeed() {
        System.out.println(camion.maxDrivingSpeed());
        System.out.println(camion.travel());
    }
}
