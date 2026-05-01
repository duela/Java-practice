package com.java.practice.inheritance;

public class InheritancePersonExample {
    public static void main(String[] args){
        // create person object
        Person person = new Person();
        person.setName("Bonny");
        person.setAge(40);
        System.out.printf("%s's age is %d%n", person.getName(), person.getAge());

        // Create employee object
        Employee employee = new Employee(1);
        employee.setName("Stacy"); // employee ia able to use the parent class name and age method
        employee.setAge(41);
        employee.setSsn("341-234-142");
        System.out.printf("%s's with ssn %s and ID %d age is %d years old %n", employee.getName(), employee.getSsn(), employee.id,employee.getAge());
    }
}
