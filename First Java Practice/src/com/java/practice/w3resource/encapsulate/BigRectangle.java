package com.java.practice.w3resource.encapsulate;

public class BigRectangle extends Rectangle {
    private double length;
    private double width;
    private double height;

    public BigRectangle(double length, double width, double height){
        super(length, width);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void displayDetails(){
        System.out.println("I am a big rectangle");
    }

    public double printArea(double length, double width, double height){
        return length * width * height;
    }
}
