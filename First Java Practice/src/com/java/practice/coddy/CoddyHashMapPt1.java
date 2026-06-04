package com.java.practice.coddy;

import java.util.HashMap;

public class CoddyHashMapPt1 {
    public static void main(String[] args){
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Nigeria", "Lagos");
        capitalCities.put("Lithuania", "Vilnius");
        capitalCities.put("Germany", "Frankfurt");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("England", "London");
        capitalCities.put("Japan", "Tokyo");
        capitalCities.remove("England");


//        capitalCities.clear();

        System.out.println(capitalCities.get(""));
        System.out.println(capitalCities);
        System.out.println(capitalCities.containsKey("Check"));


        System.out.println("\nThe values ");
        for (String index : capitalCities.values()){
            System.out.println(index);
        }

        System.out.println("\nThe key sets ");
        for (String index : capitalCities.keySet()){
            System.out.println(index);
            capitalCities.put(index, "Lagos");
        }
        System.out.println(capitalCities);

    }
}
