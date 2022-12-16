package com.example.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hi Folks ---- constructor service";
    }
}
