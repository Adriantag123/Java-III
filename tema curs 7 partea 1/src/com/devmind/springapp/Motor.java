package com.devmind.springapp;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Motor {

    private int putere;
    private String nume;
    private int numarCilindrii;

}
