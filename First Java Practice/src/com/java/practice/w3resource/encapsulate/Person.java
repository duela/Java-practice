package com.java.practice.w3resource.encapsulate;

public class Person {
    private String name;
    private int age;
    private String country;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

 class AccessPerson{
    public static void main(String[] args){
       Person person = new Person();
       person.setAge(20);
       person.setCountry("Canada");
       person.setName("Jane");
       System.out.printf("%s is from %s and is %d years old %n", person.getName(), person.getCountry(), person.getAge());
    }
}
