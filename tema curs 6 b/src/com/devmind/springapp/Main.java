package com.devmind.springapp;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        IAnimal dog = context.getBean("dog", IAnimal.class);
        IAnimal mouse = context.getBean("mouse", IAnimal.class);

        System.out.println(dog.makeSound());
        System.out.println(mouse.makeSound());
        System.out.println(dog.getFriend());

    }
}
