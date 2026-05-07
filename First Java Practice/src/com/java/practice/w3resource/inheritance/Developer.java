package com.java.practice.w3resource.inheritance;

public class Developer extends Employees{
    private double basePercent;
    private String programmingLanguage;

    public Developer(String name, double salary, String jobTitle, double basePercent, String programmingLanguage) {
        super(name, salary, jobTitle);
        this.basePercent = basePercent;
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public double calculateBonus(){
        return super.calculateBonus() * basePercent;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for " + super.generatePerformanceReport() + ": Amazing";
    }

    @Override
    public String manageProject(){
        return super.generatePerformanceReport() + " is writing code in " + programmingLanguage ;
    }
}
