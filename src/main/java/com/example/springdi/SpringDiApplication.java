package com.example.springdi;

import com.example.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx=SpringApplication.run(SpringDiApplication.class, args);

        MyController ctrl=(MyController) ctx.getBean("myController");
        System.out.println(ctrl.sayHello());
    }

}
