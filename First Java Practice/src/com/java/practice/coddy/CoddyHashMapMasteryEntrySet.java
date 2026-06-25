package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoddyHashMapMasteryEntrySet {
    public static void printMostStockedProduct(HashMap<String, Integer> inventory) {
        // Write your code here using entrySet()
        boolean isEmpty = inventory.isEmpty();
        int maxQuantity = 0;
        String product = "";
        for (Map.Entry<String, Integer> data : inventory.entrySet()) {
            if (maxQuantity < data.getValue()) {
                maxQuantity = data.getValue();
                product = data.getKey();
            }
        }

        if (isEmpty) {
            System.out.print("No products in inventory.");
        }
        else {
            System.out.printf("Most Stocked Product: %s, Quantity: %d", product, maxQuantity);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string input representing the inventory HashMap
        String inventoryString = scanner.nextLine();

        // Convert JSON string to HashMap<String, Integer>
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printMostStockedProduct(inventory);

    }
}

// Test case
// [["Mouse", 50], ["Keyboard", 30], ["Laptop", 10]]
// [["Tablet", 25], ["Phone", 15]]