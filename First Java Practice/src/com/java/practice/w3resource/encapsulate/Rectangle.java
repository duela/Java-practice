package com.java.practice.w3resource.encapsulate;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void displayDetails(){
        System.out.println("I am a rectangle");
    }

    public double printArea(double length, double width){
        return length * width;
    }
}


