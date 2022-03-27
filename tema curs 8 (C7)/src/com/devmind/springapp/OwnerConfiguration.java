package com.devmind.springapp;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.devmind.springapp")
public class OwnerConfiguration {
    @Bean
    public Motor motor(){
        Motor motor = new Motor(100, "aaaa", 4);
        return motor;
    }

    @Bean
    public Autocar autocar(){
        Autocar autocar = new Autocar(motor());
        return autocar;
    }

    @Bean
    public Motocicleta motocicleta(){
        Motocicleta motocicleta = new Motocicleta();
        return motocicleta;
    }

    public Motocicleta motocicletaViteza(){
        Motocicleta motocicletaViteza = new Motocicleta(motor(), 200);
        return motocicletaViteza;
    }

    @Bean
    public Masina masina(){
        Masina masina = new Masina();
        return masina;
    }

    @Bean
    public Owner owner(){
        Owner owner = new Owner();
        owner.setMasina(masina());
        owner.setAutocar(autocar());
        owner.setMoto(motocicletaViteza());
        return owner;
    }
}
