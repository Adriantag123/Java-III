package com.devmind.springapp;


import org.springframework.stereotype.Component;

@Component
public class Mouse implements IAnimal {

    @Override
    public String makeSound(){
        return "the mouse is squeaking";
    }

    public String getFriend() {return "mouse has no frens";}

}

   /* Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.devmind.springapp.Mouse]: No default constructor found;*/