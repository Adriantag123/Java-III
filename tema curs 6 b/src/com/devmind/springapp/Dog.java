package com.devmind.springapp;

import org.springframework.stereotype.Component;

@Component
public class Dog implements IAnimal {

    private Cat cat;
    public Dog(Cat cat){
        this.cat = cat;
    }

    @Override
    public String makeSound(){
        return "the dog barks";
    }

    public String getFriend(){
        return cat.getFriend();
    }

}
