package org.example;

import org.example.builder.CarBuilder;
import org.example.product.Car;
import org.example.product.Type;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarDirectorTest {
    @Test
    public void produce_suv_car_when_using_suv_director() {
        CarDirector carDirector = new CarDirector();
        CarBuilder carBuilder = new CarBuilder();
        carDirector.makeSUV(carBuilder);

        Car suvCar = carBuilder.getResults();

        Type excpectedType = Type.SUV;
        assertEquals(suvCar.getType(), excpectedType);
    }

    @Test
    public void produce_family_car_when_using_suv_director() {
        CarDirector carDirector = new CarDirector();
        CarBuilder carBuilder = new CarBuilder();
        carDirector.makeFamilyCar(carBuilder);

        Car suvCar = carBuilder.getResults();

        Type excpectedType = Type.FAMILY;
        assertEquals(suvCar.getType(), excpectedType);
    }
}