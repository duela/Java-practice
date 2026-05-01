package com.java.practice.variables;

class Employee {
    public String name; // public variable that is visible for any child class
    private int age; // private variable that is visible for com.java.practice.variables.Employee class only

    //Constructor method with parameters
    public Employee(String name){
        this.name = name;
    }
    // set age
    public  void setAge(int age){
        this.age = age;
    }

    //Display com.java.practice.variables.Employee info
    public  void displayEmployeeInfo(){
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

}

public class InstanceVariable {
    public static void main(String[] args){
        Employee employee1 = new Employee("Daniel");
        employee1.setAge(20);
        employee1.displayEmployeeInfo();

        System.out.println(employee1.name);
        //    System.out.println(employee1.age); age has private access in com.java.practice.variables.Employee

    }
}
