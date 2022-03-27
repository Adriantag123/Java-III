package com.devmind.springapp;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
public class Masina implements IAutomobil {

    @Override
    public String travel (){
        return "the masina travels for 300km";
    }
    @Override
    public int maxDrivingSpeed (){
        return 130;
    }
}
