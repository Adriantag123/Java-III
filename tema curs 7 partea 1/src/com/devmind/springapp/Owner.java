package com.devmind.springapp;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Owner {
    //injectare prin field
    @Autowired
    Autocar autocar;
    Masina masina;
    Motocicleta moto;

    //injectare prin setter
    @Autowired
    public void setMasina(Masina masina){
        this.masina = masina;
    }

    //injectare prin constructor
    @Autowired
    public Owner(Motocicleta moto){
        this.moto = moto;
    }

}
