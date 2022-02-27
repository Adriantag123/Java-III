package com.devmind.springapp;

public class Mouse implements IAnimal {

  /*  String AnimalName;

    public Mouse (String name){
        AnimalName = name;
    }*/

    @Override
    public String makeSound(){
        return "the mouse is squeaking";
    }

}

   /* Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.devmind.springapp.Mouse]: No default constructor found;*/