package com.devmind.springapp;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    public String friend = "cat likes dog";

    public void setFriend(String friend){
        this.friend = friend;
    }

    public String getFriend(){
        return friend;
    }

}
