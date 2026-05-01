package com.java.practice.inheritance;

public class Box {
    // variables
    private int length;
    private int width;

    // constructor method
    public Box(int length, int width){
        this.length = length;
        this.width = width;
    }
    // Display box name
    public void displayBoxName(){
        System.out.println("I am the parent class Box");
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
