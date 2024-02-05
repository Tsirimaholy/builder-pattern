package org.example.builder;


import org.example.components.Engine;
import org.example.components.GPS;
import org.example.components.TripComputer;
import org.example.product.Type;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(Engine engine);

    void setTripComputer(TripComputer tripComputer);


    void setGPS(GPS gps);
    void setType(Type type);
}
