package org.example.product;


import org.example.components.GPS;
import org.example.components.Engine;
import org.example.components.StripComputer;

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

    public StripComputer getStripComputer() {
        return stripComputer;
    }

    public void setStripComputer(StripComputer stripComputer) {
        this.stripComputer = stripComputer;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    private Engine engine;
    private StripComputer stripComputer;
    private GPS gps;

    public Car(Integer seats, Engine engine, StripComputer stripComputer, GPS gps) {
        this.seats = seats;
        this.engine = engine;
        this.stripComputer = stripComputer;
        this.gps = gps;
    }
}
