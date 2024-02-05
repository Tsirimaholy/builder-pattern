package org.example;


import org.example.builder.Builder;
import org.example.components.Engine;

public class CarDirector {
    public void makeSUV(Builder builder){
        builder.setEngine(new Engine());
        builder.setSeats(3);
    }
}
