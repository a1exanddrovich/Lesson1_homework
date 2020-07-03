package com.company;

public class Crawler extends Vehicle{

    private double topPower;
    private double weight;

    public Crawler(double topPower, double weight) {

        this.topPower = topPower;
        this.weight = weight;

    }

    public Crawler(String type, double topPower, double weight) {

        super(type);
        this.topPower = topPower;
        this.weight = weight;

    }

    public double getTopPower() {

        return topPower;

    }

    public double getWeight() {

        return weight;

    }

    public void setTopPower(double topPower) {

        this.topPower = topPower;

    }

    public void setWeight(double weight) {

        this.weight = weight;

    }

    @Override
    public double powerDensity() {

        return this.topPower / this.weight;

    }

}
