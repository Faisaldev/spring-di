package com.example.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "hi folks ---- Setter service";
    }
}
