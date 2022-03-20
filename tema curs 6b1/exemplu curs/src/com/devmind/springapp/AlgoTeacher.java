package com.devmind.springapp;

import org.springframework.stereotype.Component;

@Component // fara a specifica bean id-ul
public class AlgoTeacher {

    private String message = "think for yourself";

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
