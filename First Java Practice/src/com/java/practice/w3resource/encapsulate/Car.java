package com.java.practice.w3resource.encapsulate;

public class Car {
    private String company_name;
    private String model_name;
    private String year;
    private double mileage;

   public Car(double mileage){
        this.mileage = mileage;
    }

    public String getCompany_name(){
       return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getModel_name(){
       return model_name;
    }

    public void setModel_name(String model_name){
       this.model_name = model_name;
    }

    public String getYear(){
       return year;
    }

    public  void setYear(String year){
       this.year = year;
    }

    public double getMileage(){
       return mileage;
    }
}

class AccessCar{
    public static void main(String[] args){
        Car car = new Car(102.5);
        car.setCompany_name("BMV");
        car.setModel_name("X7");
        car.setYear("2027");

        System.out.println(car.getCompany_name());
        System.out.println(car.getModel_name());
        System.out.println(car.getYear());
        System.out.printf("%.2f%n",car.getMileage());

    }
}
