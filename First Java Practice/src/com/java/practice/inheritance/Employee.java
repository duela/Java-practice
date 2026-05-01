package com.java.practice.inheritance;

class Employee extends Person {   // extend makes it possible for employee to inherite person
    private String ssn;
    int id;

    public Employee(int id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


}

