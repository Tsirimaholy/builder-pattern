package org.example.components;

public class GPS {
    private String destination;
    private String currentLocation;

    public GPS(){
        this.currentLocation = "Here you are XD!";
    }
    public GPS(String destination) {
        this.destination = destination;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
