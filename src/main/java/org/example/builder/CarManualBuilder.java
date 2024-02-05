package org.example.builder;


import org.example.components.Engine;
import org.example.components.GPS;
import org.example.components.TripComputer;
import org.example.product.CarManual;
import org.example.product.Type;

public class CarManualBuilder implements Builder {
    private Integer seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;
    private Type type;
    private CarManualBuilder(){

    }
    @Override
    public void reset() {

    }

    @Override
    public void setSeats(int number) {
        this.seats = number;
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

    public void getResults(){
        new CarManual(engine, tripComputer, gps);
    }

    public Type getType() {
        return type;
    }

    public Integer getSeats() {
        return seats;
    }
}
