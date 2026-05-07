package com.java.practice.w3resource.inheritance;

public class Manager extends Employees{
    private double basePercent;
    private  int numberOfSubordinates;


    public Manager(String name,  double salary, String jobTitle, double basePercent, int numberOfSubordinates) {
        super(name, salary, jobTitle);
        this.basePercent = basePercent;
        this.numberOfSubordinates = numberOfSubordinates;

    }

    @Override
    public double calculateBonus(){
        return super.calculateBonus() * basePercent;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for " + super.generatePerformanceReport() + ": Excellent";
     }

     @Override
    public String manageProject(){
        return super.generatePerformanceReport() + " is managing a project  with " + numberOfSubordinates + " of subordinates";
     }
}
