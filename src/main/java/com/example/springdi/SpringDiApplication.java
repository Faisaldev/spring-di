package com.example.springdi;

import com.example.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx=SpringApplication.run(SpringDiApplication.class, args);

        I18NController i18NController=(I18NController) ctx.getBean("i18NController");
        System.out.println(i18NController.sayHello());

        MyController ctrl=(MyController) ctx.getBean("myController");
        System.out.println("-----Primary Bean");
        System.out.println(ctrl.sayHello());

        System.out.println("----Property Injector");
        PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.sayHello());

        System.out.println("----Setter Injector");
        SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.sayHello());

        System.out.println("----Constructor Injector");
        ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayHello());

    }

}
