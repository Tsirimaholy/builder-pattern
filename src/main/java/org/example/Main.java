package org.example;

import org.example.builder.CarBuilder;
import org.example.product.Car;

public class Main {
    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();
        CarBuilder carBuilder = new CarBuilder();
        carDirector.makeSUV(carBuilder);

        Car suvCar = carBuilder.getResults();
    }
}