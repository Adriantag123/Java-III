package com.devmind.springapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OwnerConfiguration.class);

        Owner owner = context.getBean("owner", Owner.class);

        System.out.println(owner.getAutocar().maxDrivingSpeed());
        System.out.println(owner.getAutocar().travel());
        System.out.println(owner.getMasina().maxDrivingSpeed());
        System.out.println(owner.getMasina().travel());
        System.out.println("motocicleta viteza: " + owner.getMoto().getSuperSpeed());

        Autocar autocar = context.getBean("autocar", Autocar.class);
        System.out.println("Specificatii autocar: " + autocar.getMotor().specs());

    }
}
