package com.jmoreira.springframework.didemo.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements  GreetingService {

    @Override
    public String sayHello() {
        return "Hello - Primary service";
    }
}
