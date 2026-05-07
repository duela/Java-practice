package com.java.practice.w3resource.inheritance;

public abstract class Shapes {
// abstract = incomplete / not fully defined - It tells Java:
// “This class is just a blueprint”
// “You are NOT allowed to create objects from it”
    public abstract double getArea();
    public abstract double getPerimeter();
}

class AccessorShapes{
    public static void main(String[] args){
        Rectangles rectangle = new Rectangles(5.2,2.3);
        System.out.printf("The area of the rectangle is: %.2f and the perimeter is: %.2f%n",
                rectangle.getArea(), rectangle.getPerimeter());

        Circles circle = new Circles(8);
        System.out.printf("The area of the circle is: %.2f and the perimeter is: %.2f",
                circle.getArea(), circle.getPerimeter());

    }
}
