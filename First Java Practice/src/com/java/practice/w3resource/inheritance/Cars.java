package com.java.practice.w3resource.inheritance;

public class Cars extends Vehicles {

    public Cars(double fuelConsumed, double distance, double speed, double time) {
        super(fuelConsumed, distance, speed, time);
    }

    @Override
    public double maximumSpeed(){
        return 260.00;
    }
}
