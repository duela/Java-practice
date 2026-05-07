package com.java.practice.w3resource.inheritance;

public class Programmer extends Employees{
    private String programmingLanguage;
    private double basePercent;

    public Programmer(String name, double salary, String jobTitle, double basePercent, String programmingLanguage) {
        super(name, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
        this.basePercent = basePercent;
    }

    @Override
    public double calculateBonus(){
        return super.calculateBonus() * basePercent;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for " + super.generatePerformanceReport() + ": Awesome";
    }

    @Override
    public String manageProject(){
        return super.generatePerformanceReport() + " is writing code in " + programmingLanguage ;
    }
}
