package com.java.practice.w3resource.inheritance;

public abstract class Employees {
    private  String name;
    private double salary;
    private String jobTitle;

    public Employees(String name, double salary, String jobTitle) {
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus(){
        return salary;
    }

    public String generatePerformanceReport(){
        return  jobTitle + " " + name;
    }

    public abstract String manageProject();

}

class AccessorEmployees{
    public static void main(String[] args){
        Manager manager = new Manager("Chris", 5600, "Engineering Manager", 0.15, 8);
        // Printing the manager's bonus
        System.out.println("Manager's Bonus: $" + manager.calculateBonus());
        // Printing the developer's bonus
        Developer developer = new Developer("Emily", 2800, "Frontend Developer", 0.10, "ReactJS");
        System.out.println("Developer's Bonus: $" + developer.calculateBonus());
        // Printing the programmer's bonus
        Programmer programmer = new Programmer("Dave", 4800, "Backend Engineer", 0.12, "Java");
        System.out.println("Programmer's Bonus: $" + programmer.calculateBonus());

        // Printing the manager's performance report
        System.out.println(manager.generatePerformanceReport());
        // Printing the developer's performance report
        System.out.println(developer.generatePerformanceReport());
        // Printing the programmer's performance report
        System.out.println(programmer.generatePerformanceReport());

        // Manager managing a project
        System.out.println(manager.manageProject());
        // Developer managing a project
        System.out.println(developer.manageProject());
        // Programmer managing a project
        System.out.println(programmer.manageProject());

    }
}