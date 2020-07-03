package com.company;

import com.company.Vehicle;
import com.company.Car;
import com.company.Crawler;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Crawler("Crawler", 550, 10);
        vehicles[1] = new Car("Car", 33, 3);
        getAreas(vehicles);

    }

    static void getAreas(Vehicle[] vehicles) {

        for (Vehicle vehicle : vehicles) {

            System.out.println("The type of the vehicle is " + vehicle.getType() + " and its power density is " + vehicle.powerDensity());

        }

    }

}
