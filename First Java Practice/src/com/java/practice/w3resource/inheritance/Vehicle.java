package com.java.practice.w3resource.inheritance;

public class Vehicle {
    public void drive(){
        System.out.println("Repairing a car");
    }
}

class AccessVehicle{
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.drive();
        Car car = new Car();
        car.drive();
    }
}