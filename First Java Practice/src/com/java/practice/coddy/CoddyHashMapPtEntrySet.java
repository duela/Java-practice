package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoddyHashMapPtEntrySet {
    public static void printInventoryEntrySet(HashMap<String, Integer> inventory) {
        // Write your code here using entrySet()
        for (Map.Entry<String, Integer> data : inventory.entrySet()){
            System.out.printf("Product: %s, Quantity: %d%n", data.getKey(), data.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inventoryString = scanner.nextLine();

        // Convert JSON string to HashMap<String, Integer>
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printInventoryEntrySet(inventory);
    }
}

// Test case
//{"Laptop": 10, "Mouse": 50, "Keyboard": 30}
