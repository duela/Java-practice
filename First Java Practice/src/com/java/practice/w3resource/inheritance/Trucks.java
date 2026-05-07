package com.java.practice.w3resource.inheritance;

public class Trucks extends Vehicles{

    public Trucks(double fuelConsumed, double distance, double speed, double time) {
        super(fuelConsumed, distance, speed, time);
    }
    @Override
    public double maximumSpeed(){
        return 100.00;
    }
}
