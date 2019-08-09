package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/")
    public String showGreeting() throws InterruptedException {

        double rnd = Math.random();

        //System.out.println("Первое обращение " + rnd);
//        Thread.sleep(10000);
        return "Hello from usually WebApp!!! " + rnd;
    }

}
