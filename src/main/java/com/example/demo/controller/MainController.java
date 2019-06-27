package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/")
    public String showGreeting() throws InterruptedException {
        System.out.println("Первое обращение");
        Thread.sleep(5000000);
        System.out.println("Второе обращение");
        return "Hello from usually WebApp!!!";
    }

}
