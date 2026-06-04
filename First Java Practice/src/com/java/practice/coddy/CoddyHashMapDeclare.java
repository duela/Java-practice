package com.java.practice.coddy;

import java.util.HashMap;

public class CoddyHashMapDeclare {
    public static HashMap<String, String> createStringStringMap() {
        // Write your code here
        HashMap<String, String> fruits = new HashMap<>();
        fruits.put("apple", "red");
        fruits.put("banana", "yellow");
        fruits.put("grape", "purple");
        return  fruits;

    }

    public static void main(String[] args) {
        HashMap<String, String> map = createStringStringMap();

        // Print the HashMap
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
