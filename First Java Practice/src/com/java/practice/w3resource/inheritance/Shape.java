package com.java.practice.w3resource.inheritance;

public class Shape {


    public int getArea(){
        return 0;
    }

}

class AccessorShape{
    public static void main(String[] args){
        Shape shape = new Shape();
        int shapeArea = shape.getArea();
        System.out.println("The shape default area is " + shapeArea);
        Rectangle rectangle = new Rectangle(5,8);
        int rectangleArea = rectangle.getArea();
        System.out.println("The rectangle area is " + rectangleArea);

    }
}