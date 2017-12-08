package com.jmoreira.springframework.didemo.Service;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello from Getter";
    }
}
