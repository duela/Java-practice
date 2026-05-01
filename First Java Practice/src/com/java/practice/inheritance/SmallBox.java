package com.java.practice.inheritance;

public class SmallBox extends Box{
    private int length;
    private int width;

    public SmallBox(int length, int width) {
        super(length, width); // calls parent constructor
        this.length = length;
        this.width = width;
    }
    // Display box name
    @Override
    public void displayBoxName() {
        System.out.println("I am a small box class");
    }
    // Display area
    public void printArea(){
        int area = length * width;
        System.out.printf("Area of small box is: %dm2 %n", area );
    }

}
