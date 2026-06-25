package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Scanner;

public class CoddyHashMapPt4 {
    public static void modifyAndResetHashMap(HashMap<String, Integer> data) {
        // Write your code here

        System.out.printf("Is empty: %b%n", data.isEmpty());
        System.out.printf("Size: %d%n", data.size());
        boolean resetChecker = data.containsKey("Reset");
        if (!resetChecker) {
            data.put("Reset", 0);
        }
//        data.keySet();
        System.out.printf("Size after modification: %d%n", data.size());
        data.clear();
        System.out.printf("Is empty after clear: %b%n", data.isEmpty());

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();

        // Convert String of HashMap to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> data = new Gson().fromJson(hashMapString, mapType);

        modifyAndResetHashMap(data);
    }
}
