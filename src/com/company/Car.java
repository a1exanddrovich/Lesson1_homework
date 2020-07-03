package com.company;

public class Car extends Vehicle{

    private double weight;
    private double airConsumption;

    public Car(double airConsumption, double weight) {

        this.airConsumption = airConsumption;
        this.weight = weight;

    }

    public Car(String type, double airConsumption, double weight) {

        super(type);
        this.airConsumption = airConsumption;
        this.weight = weight;

    }

    public double getWeight() {

        return weight;

    }

    public double getAirConsumption() {

        return airConsumption;

    }

    public void setWeight(double weight) {

        this.weight = weight;

    }

    public void setAirConsumption(double airConsumption) {

        this.airConsumption = airConsumption;

    }


    @Override
    public double powerDensity() {
        return airConsumption / 3 / weight;
    }
}
