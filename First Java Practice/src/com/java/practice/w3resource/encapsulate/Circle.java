package com.java.practice.w3resource.encapsulate;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return (Math.PI * Math.pow(radius, 2));
    }
    public double calculatePerimeter(){
        return (2 * Math.PI * radius);
    }

}

class AccessCircle{
    public static void main(String[] args){
        Circle circle = new Circle(7);
        System.out.printf("The radius of the circle is: %.2f%n", circle.getRadius());
        System.out.printf("The area of the circle is: %f%n", circle.calculateArea());
        System.out.printf("The perimeter of the circle is: %f%n", circle.calculatePerimeter());

    }
}
