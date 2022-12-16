package com.example.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "hi folks ----- Property Service";
    }
}
