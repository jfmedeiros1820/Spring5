package com.jmoreira.springframework.didemo.Service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{

    @Override
    public String sayHello() {
        return "Hello from Constructor";
    }
}