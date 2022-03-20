package com.devmind.springapp;

import org.springframework.stereotype.Component;

@Component  // fara a specifica bean id-ul
public class WisdomWordsService {

    private String message = "Hard work pays off";

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}