package com.java.practice.w3resource.encapsulate;

public class SmallRectangle extends Rectangle {
    private double length;
    private double width;

    public SmallRectangle(double length, double width) {
        super(length, width);
        this.length = length;
        this.width = width;
    }

    public void displayDetails(){
        System.out.println("I am a small rectangle");
    }

}
