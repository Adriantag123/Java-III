package com.devmind.springapp;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Owner {

    Autocar autocar;
    Masina masina;
    Motocicleta moto;

    public void setMasina(Masina masina){
        this.masina = masina;
    }
    public void setAutocar(Autocar autocar){
        this.autocar = autocar;
    }

    /*public Owner(Autocar autocar, Masina masina, Motocicleta moto){
        this.autocar = autocar;
        this.masina = masina;
        this.moto = moto;
    }*/

}
