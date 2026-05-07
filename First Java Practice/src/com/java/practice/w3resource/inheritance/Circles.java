package com.java.practice.w3resource.inheritance;

public class Circles extends Shapes {
    private double radius;

    public Circles(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

}
