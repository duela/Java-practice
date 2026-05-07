package com.java.practice.w3resource.inheritance;

public class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("Working as an employee");
    }

    public  int getSalary(){
        return salary;
    }
}

class AccessorEmployee{
    public static void main(String[] args){
        Employee employee = new Employee(2000);
        employee.work();
        System.out.println("New employee salary is " + employee.getSalary());
        HRManager hrManager = new HRManager(5000);
        hrManager.work();
        System.out.println("Updated employee salary is " + hrManager.getSalary());

    }
}