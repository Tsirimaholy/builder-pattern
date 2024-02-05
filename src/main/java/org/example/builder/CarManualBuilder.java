package org.example.builder;


import org.example.components.Engine;
import org.example.components.GPS;
import org.example.components.TripComputer;

public class CarManualBuilder implements Builder {
    private CarManualBuilder(){

    }
    @Override
    public void reset() {

    }

    @Override
    public void setSeats(int number) {

    }

    @Override
    public void setEngine(Engine engine) {

    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {

    }

    @Override
    public void setGPS(GPS gps) {

    }
}
