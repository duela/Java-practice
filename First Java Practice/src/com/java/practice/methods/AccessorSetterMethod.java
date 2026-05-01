package com.java.practice.methods;

public class AccessorSetterMethod {
    public static void main(String[] args){
        Car volvo = new Car("Volvo", "XC60", "white", 2026);
        System.out.println("The initial car maker is: " + volvo.getMake());

        //use setter method to set new value
        volvo.setMake("Mercedes");
        volvo.setModel("GLE");
        volvo.setColour("black");
        volvo.setYear(2025);

        System.out.println("The new car maker is: " + volvo.getMake());
        System.out.println("The new car model is: " + volvo.getModel());
        System.out.println("The new car colour is: " + volvo.getColour());
        System.out.println("The new car year is: " + volvo.getYear());


    }

    public static class  Car{
        String make;
        String model;
        String colour;
        int year;

        public Car(String make, String model, String colour, int year){
            this.make = make;
            this.model = model;
            this.colour = colour;
            this.year = year;
        }

        // Getter methods
        public String getMake(){ return  make; }
        public String getModel(){ return model; }
        public String getColour(){ return colour; }
        public int getYear(){ return year; }


        // Setter methods
        public void setMake(String newMake){
            this.make = newMake;
        }
        public void setModel(String newModel){
            this.model = newModel;
        }
        public void setColour(String newColour){
            this.colour = newColour;
        }
        public void setYear(int newYear){
            this.year = newYear;
        }
    }
}
