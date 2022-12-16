package com.example.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service("i18nGreetingService")
public class I18NEnglishService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello world --- English profile";
    }
}
