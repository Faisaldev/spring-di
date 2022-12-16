package com.example.springdi.controllers;

import com.example.springdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller=new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}