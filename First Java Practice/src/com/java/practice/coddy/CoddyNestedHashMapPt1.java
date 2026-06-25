package com.java.practice.coddy;

import java.util.HashMap;

public class CoddyNestedHashMapPt1 {
    public static void main(String[] args){
        HashMap<String, HashMap<String, Integer>> inventory  = new HashMap<>();
        inventory.put("Electronics", new HashMap<>());
        inventory.get("Electronics").put("Laptop", 1200);
        System.out.println(inventory.isEmpty());
// Output: false
        System.out.println(inventory.size());
// Output: 1
        System.out.println(inventory.get("Electronics"));
        System.out.println(inventory.get("Electronics").size());
        System.out.println(inventory.get("Electronics").keySet());

        System.out.println((inventory.get("Electronics").get("Laptop")));



    }
}
