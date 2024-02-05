package org.example.builder;


import org.example.components.RandomEngine;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(RandomEngine engine);
    void setTripComputer();
    void setGPS();
}
