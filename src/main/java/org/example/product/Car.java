package org.example.product;


import org.example.components.GPS;
import org.example.components.Engine;
import org.example.components.TripComputer;

public class Car {
    private Integer seats;

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public TripComputer getStripComputer() {
        return tripComputer;
    }

    public void setStripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;

    public Car(Integer seats, Engine engine, TripComputer tripComputer, GPS gps) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }
}
