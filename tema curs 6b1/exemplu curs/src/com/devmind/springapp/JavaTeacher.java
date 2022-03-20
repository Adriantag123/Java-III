package com.devmind.springapp;


import org.springframework.stereotype.Component;

@Component("javaTeacherAnnotation")
public class JavaTeacher implements ITeacher {

    private WisdomWordsService wisdomService;
    private AlgoTeacher algoTeacher;

    // constructor unic care primeste ca parametru un obiect de tipul WisdomWordsService
    public JavaTeacher(WisdomWordsService wisdomService, AlgoTeacher algoTeacher) {
        this.wisdomService = wisdomService;
        this.algoTeacher = algoTeacher;
    }

    @Override
    public String getHomeWork() {
        return "Create 100 classes";
    }

    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }

    @Override
    public String getInsight(){
        return algoTeacher.getMessage();
    }
}