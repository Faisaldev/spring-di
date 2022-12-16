package com.example.springdi.controllers;

import com.example.springdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller=new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}