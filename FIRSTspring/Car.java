package com.example.FIRSTspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    Engine engine;
    @Autowired
    public Car(Engine engine){
        this.engine=engine;
    }
    void move(){
        engine.run();
        System.out.println("car is moveing ");
    }
}
