package com.java.practice.w3resource.inheritance;

public class EmployeePerson extends Person {
    private String id;
    private String jobTitle;

    public EmployeePerson(String id, String firstName, String lastName, String jobTitle) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.id = id;
    }

    public String getEmployeeId() {
        return id;
    }

    @Override
    public String getLastName(){
        return super.getLastName() + " " + jobTitle;
    }
}
