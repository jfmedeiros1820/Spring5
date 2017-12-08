package com.jmoreira.springframework.didemo.controllers;

import com.jmoreira.springframework.didemo.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    // Se o nome da propriedade for igual ao nome do bean que implementa a interface o Spring usa reflexão para injetar o correto.
    @Autowired
    @Qualifier("greetingServiceImpl")
    private GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayHello();
    }
}
