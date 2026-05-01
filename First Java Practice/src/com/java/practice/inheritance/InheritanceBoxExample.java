package com.java.practice.inheritance;

public class InheritanceBoxExample {
    public static void main(String[] args){
        // create box object
        Box box = new Box(10, 5);
        System.out.printf("The box length is: %d, and the width is: %d%n", box.getLength(), box.getWidth());
        box.displayBoxName();


        // create small box object
        SmallBox smallBox = new SmallBox(5, 4);
        smallBox.displayBoxName();
        smallBox.printArea();

        // create big box object
        BigBox bigBox = new BigBox(3,4,5);
        bigBox.displayBoxName();
        bigBox.printVolume();
    }
}
