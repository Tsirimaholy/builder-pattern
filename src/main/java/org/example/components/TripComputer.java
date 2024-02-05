package org.example.components;

public class TripComputer {
    private int currentSpeed = 0;
    private double fuelLevel;

    public TripComputer(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
}
