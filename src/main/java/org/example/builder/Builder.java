package org.example.builder;


import org.example.components.Engine;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(Engine engine);
    void setTripComputer();
    void setGPS();
}
