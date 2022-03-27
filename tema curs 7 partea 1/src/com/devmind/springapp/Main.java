package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Owner owner = context.getBean("owner", Owner.class);

        System.out.println(owner.getAutocar().maxDrivingSpeed());

        System.out.println(owner.getMoto().maxDrivingSpeed());

        System.out.println(owner.getMasina().maxDrivingSpeed());

        //motor
        owner.getMasina().getMotor().setNumarCilindrii(4);
        System.out.println(owner.getMasina().getMotor().getNumarCilindrii());

        //camion injectat cu moto
        Camion camion = context.getBean("camion", Camion.class);
        camion.printSpeed();

    }
}
