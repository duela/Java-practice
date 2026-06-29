package com.java.practice.coddy;

import java.util.HashSet;

public class CoddyHashSetPt1 {
    public static void main(String[] args){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println(fruits);
    }
}
