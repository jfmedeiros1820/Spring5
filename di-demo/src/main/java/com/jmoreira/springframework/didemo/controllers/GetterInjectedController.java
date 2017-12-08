package com.jmoreira.springframework.didemo.controllers;

import com.jmoreira.springframework.didemo.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }

    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
