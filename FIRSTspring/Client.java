package com.example.FIRSTspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Client {
    public static void main(String[] args) {
        ApplicationContext context=
                SpringApplication.run(Client.class,args);
        System.out.println("before creating bean");
        Car c = context.getBean(Car.class);
        System.out.println("after creating bean");
        c.move();

    }
}

