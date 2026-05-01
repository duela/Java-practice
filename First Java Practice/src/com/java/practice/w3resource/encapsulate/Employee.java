package com.java.practice.w3resource.encapsulate;

public class Employee {
    private String employee_id;
    private String employee_name;
    private double employee_salary;

    public Employee(String employee_id, String employee_name, double employee_salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public double getEmployee_salary() {
        return employee_salary;
    }


}

class AccessEmployee{
    public static void main(String[] args){
        Employee employee = new Employee("5001", "Mary Jane", 5000);
        System.out.printf("Welcome our %s, your employee ID is %s and your Gross salary is $%.2f%n",
                employee.getEmployee_name(), employee.getEmployee_id(), employee.getEmployee_salary());
        employee.setEmployee_id("5002");
        employee.setEmployee_name("Mary Jane Jr");

        System.out.printf("Welcome our %s, your employee ID is %s and your Gross salary is $%.2f%n",
                employee.getEmployee_name(), employee.getEmployee_id(), employee.getEmployee_salary());

    }
}
