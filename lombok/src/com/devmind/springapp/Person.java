package com.devmind.springapp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Person {
    @Setter @Getter
    int age;
    @Setter @Getter
    String name;

    @Override public String toString() {
        return String.format("%s (age: %d)", name, age);
    }


}
