package com.java.practice.methods;

public class AccessorGetterMethod {
    public static void main(String[] args){
        //Create object
        Automobile toyota = new Automobile("Toyota", "RAV4", "Blue", 2024);
        Automobile ford = new Automobile("Ford", "Escape", "Red", 2023);

        // USe getter method to get the value
        System.out.println("com.java.practice.methods.AccessorSetterMethod.Car make is: " + toyota.getMake());
        System.out.println("com.java.practice.methods.AccessorSetterMethod.Car make is: " + ford.getMake());

        System.out.println("com.java.practice.methods.AccessorSetterMethod.Car model is: " + toyota.getModel());
        System.out.println("com.java.practice.methods.AccessorSetterMethod.Car model is: " + ford.getModel());


        System.out.println("com.java.practice.methods.AccessorSetterMethod.Car colour is: " + toyota.getColour());
        System.out.println("com.java.practice.methods.AccessorSetterMethod.Car colour is: " + ford.getColour());

        System.out.println("com.java.practice.methods.AccessorSetterMethod.Car year is: " + toyota.getYear());
        System.out.println("com.java.practice.methods.AccessorSetterMethod.Car year is: " + ford.getYear());

    }

    public static class VehicleConstructorMethod {
        public static void printHeader(){
            System.out.println("=================");
            System.out.println("Event Schedule");
            System.out.println("=================");


        }
        public static void main(String[] args){
            Vehicle v2 = new Vehicle("Tesla", "Model 3 luxury sedan", 2026);
            v2.start();
            printHeader();
            // Create your house here using System.out methods

        }

    }
}
