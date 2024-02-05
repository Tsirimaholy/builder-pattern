package org.example.components;

public class Engine {
    // gasoline, diesel, hybrid
    private String fuelType;
    private Integer topSpeed;
    // L/km
    private Integer fuelEfficiency;
    private Integer manufactureYear;
    private Double weight;
    public Engine(){

    }
    public Engine(String fuelType, Integer topSpeed, Integer fuelEfficiency, Integer manufactureYear, Double weight) {
        this.fuelType = fuelType;
        this.topSpeed = topSpeed;
        this.fuelEfficiency = fuelEfficiency;
        this.manufactureYear = manufactureYear;
        this.weight = weight;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Integer getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(Integer fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public Integer getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(Integer manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
