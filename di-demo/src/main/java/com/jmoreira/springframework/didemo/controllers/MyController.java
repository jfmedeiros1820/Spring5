package com.jmoreira.springframework.didemo.controllers;

import com.jmoreira.springframework.didemo.Service.GreetingService;
import com.jmoreira.springframework.didemo.Service.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        return greetingService.sayHello();
    }
}
