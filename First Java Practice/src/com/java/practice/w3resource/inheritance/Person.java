package com.java.practice.w3resource.inheritance;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}

class AccessorPerson{
    public static void main(String[] args){
//        Person person = new Person("Raphael", "Jacob");
//        System.out.printf("Full name %s %s%n",
//                person.getFirstName(),
//                person.getLastName());

        EmployeePerson employeePerson = new EmployeePerson("ID-45963","Charles", "James", "Data Analyst");
        System.out.printf("Full name: %s %s Employee ID: %s %n",
                employeePerson.getFirstName(),
                employeePerson.getLastName(),
                employeePerson.getEmployeeId()
                );

    }
}
