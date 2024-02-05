package org.example.builder;


import org.example.components.Engine;
import org.example.components.GPS;
import org.example.components.TripComputer;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(Engine engine);

    void setTripComputer(TripComputer tripComputer);


    void setGPS(GPS gps);
}
