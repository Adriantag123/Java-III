package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ITeacher theTeacher = context.getBean("javaTeacherAnnotation", ITeacher.class);
        System.out.println(theTeacher.getWisdom());
        System.out.println(theTeacher.getHomeWork());
        System.out.println(theTeacher.getInsight());

    }
}
