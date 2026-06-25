package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Scanner;

public class CoddyHashMapPt3 {
    public static void testHashMapMethods(HashMap<String, Integer> data) {
        // Write your code here
        boolean isEmpty = data.isEmpty();
        int getSize = data.size();
        System.out.printf("Is empty: %b%n", isEmpty);
        System.out.printf("Size: %d%n", getSize);
        data.clear();
        System.out.printf("Is empty after clear: %b", data.isEmpty());


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();

        // Convert String of HashMap to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> data = new Gson().fromJson(hashMapString, mapType);

        testHashMapMethods(data);
    }
}
