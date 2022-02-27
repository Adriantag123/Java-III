package com.devmind.springapp;

public class Dog implements IAnimal {
    @Override
    public String makeSound(){
        return "the dog barks";
    }
}
