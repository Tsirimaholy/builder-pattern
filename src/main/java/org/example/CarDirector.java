package org.example;


import org.example.builder.Builder;
import org.example.components.Engine;
import org.example.components.GPS;
import org.example.components.TripComputer;
import org.example.product.Type;

public class CarDirector {
    public void makeSUV(Builder builder) {
        Engine suvEngine = new Engine("hybrid", 180, 10, 2023, 2000.0);

        builder.setType(Type.SUV);
        builder.setEngine(suvEngine);
        builder.setSeats(5);
        builder.setGPS(new GPS());
        builder.setTripComputer(new TripComputer(88));
    }

    public void makeFamilyCar(Builder builder){
        Engine engine = new Engine("hybrid", 180, 12, 2023, 1500.0);

        builder.setType(Type.FAMILY);
        builder.setEngine(engine);
        builder.setSeats(8);
        builder.setGPS(new GPS());
        builder.setTripComputer(new TripComputer(90));
    }
}
