package org.example.builder;

import org.example.components.GPS;
import org.example.components.Engine;
import org.example.components.TripComputer;
import org.example.product.Car;
import org.example.product.Type;

public class CarBuilder implements Builder {
    private Integer seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;
    private Type type;

    @Override
    public void reset() {
        this.seats = null;
        this.engine = null;
        this.tripComputer = null;
        this.gps = null;
    }

    @Override
    public void setSeats(int number) {
        this.seats  = number;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPS(GPS gps) {
        this.gps = gps;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    public Integer getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public TripComputer getStripComputer() {
        return tripComputer;
    }

    public GPS getGps() {
        return gps;
    }

    public Car getResults(){
        return new Car(seats, engine, tripComputer, gps, Type.FAMILY);
    }

    public Type getType() {
        return type;
    }
}
