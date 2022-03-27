package com.devmind.springapp;

import lombok.Data;

@Data
public class Motor {

    private int putere;
    private String nume;
    private int numarCilindrii;

    public Motor (int putere, String nume, int numarCilindrii){
        this.putere = putere;
        this.nume = nume;
        this.numarCilindrii = numarCilindrii;
    }

    public String specs (){
        return ("putere " + this.putere + " nume " + this.nume + " cilindrii " + this.numarCilindrii);
    }

}
