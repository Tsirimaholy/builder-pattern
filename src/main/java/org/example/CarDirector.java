package org.example;


import org.example.builder.Builder;
import org.example.components.RandomEngine;

public class CarDirector {
    public void makeSUV(Builder builder){
        builder.setEngine(new RandomEngine());
        builder.setSeats(3);
    }
}
