package com.company;

public abstract class Vehicle {

    private String type;

    public Vehicle() {

    }

    public Vehicle(String type) {

        this.type = type;

    }

    public String getType() {

        return type;

    }

    public void setType(String type) {

        this.type = type;

    }

    public abstract double powerDensity();

}
