package com.quiz.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Sum {
    @RequestMapping(value = "add/first/{first}/second/{second}", method = RequestMethod.GET)
    public int sum(@PathVariable int first, @PathVariable int second) {
        return first + second;
    }
}
