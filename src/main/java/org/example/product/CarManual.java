package org.example.product;

import org.example.components.Engine;
import org.example.components.GPS;
import org.example.components.TripComputer;

public class CarManual {
    private Integer seats;
    private Type type;
    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;

    public CarManual(Engine engine, TripComputer tripComputer, GPS gps) {
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
        this.seats = 5;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }
}
