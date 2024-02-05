package org.example;

import org.example.builder.CarBuilder;
import org.example.product.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CarDirector carDirector = new CarDirector();
        CarBuilder carBuilder = new CarBuilder();
        carDirector.makeSUV(carBuilder);

        Car suvCar = carBuilder.getResults();
        System.out.println(suvCar.getSeats());
    }
}