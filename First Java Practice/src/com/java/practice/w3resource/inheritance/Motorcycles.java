package com.java.practice.w3resource.inheritance;

public class Motorcycles extends Vehicles {

    public Motorcycles(double fuelConsumed, double distance, double speed, double time) {
        super(fuelConsumed, distance, speed, time);
    }

    @Override
    public double maximumSpeed(){
        return 340.00;
    }
}
