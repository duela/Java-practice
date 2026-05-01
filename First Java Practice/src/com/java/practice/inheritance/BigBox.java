package com.java.practice.inheritance;

public class BigBox extends Box{
    private int length;
    private int width;
    private int height;

    public BigBox(int length, int width, int height){
        super(length, width); // calls parent constructor
        this.length = length;
        this.width = width;
        this.height = height;
    }

//    public void displayBoxName() {
//        System.out.println("I am a big box class");
//    }

    public void printVolume(){
        int volume = length * width * height;
        System.out.printf("Volume of big box is: %dm3 %n", volume );

    }
}
