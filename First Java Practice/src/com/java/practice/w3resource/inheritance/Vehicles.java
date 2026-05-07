package com.java.practice.w3resource.inheritance;

public abstract class Vehicles {
    private double fuelConsumed;
    private double distance;
    private double speed;
    private double time;

    public Vehicles(double fuelConsumed, double distance, double speed, double time) {

        this.fuelConsumed = fuelConsumed;
        this.distance = distance;
        this.speed = speed;
        this.time = time;
    }

    public  double calculateFuelEfficiency(){
        return distance / fuelConsumed;
    }
    public  double calculateDistanceTraveled(){
        return speed * time;
    }
    public abstract double maximumSpeed();

}

class  AccessorVehicles{
    public static void main(String[] args){
        Trucks trucks = new Trucks(50.0, 300.0, 80.0, 3.5);
        Cars cars = new Cars(20.0, 400.0, 100.0, 4.0);
        Motorcycles motorcycles = new Motorcycles(5.0, 150.0, 120.0, 2.0);

        // Displaying Calculations
        System.out.println("Truck Efficiency: " + trucks.calculateFuelEfficiency() +
                "km/L, Dist: " + trucks.calculateDistanceTraveled() +
                "km, Max Speed: " + trucks.maximumSpeed() + "km/h");
        System.out.println("Car Efficiency: " + cars.calculateFuelEfficiency() +
                "km/L, Dist: " + cars.calculateDistanceTraveled() +
                "km, Max Speed: " + cars.maximumSpeed() + "km/h");
        System.out.println("Motorcycles Efficiency: " + motorcycles.calculateFuelEfficiency() +
                "km/L, Dist: " + motorcycles.calculateDistanceTraveled() +
                "km, Max Speed: " + motorcycles.maximumSpeed() + "km/h");


    }
}