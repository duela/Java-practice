package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoddyNestedHashMapPt2 {
    public static void printNestedInventory(HashMap<String, HashMap<String, Integer>> inventory) {
        // Iterate over each category in the outer HashMap
        // For each category, print "Category: <name>"
        // If the inner map is empty, print "  (No products)"
        // Otherwise, iterate over each product and print "  Product: <name>, Price: <price>"
        // Write your code here

        for (Map.Entry<String, HashMap<String, Integer>> data : inventory.entrySet()){
            String categories = data.getKey().trim();
            System.out.printf("Category: %s%n", categories);
            Map<String, Integer> product = data.getValue();
            if (!product.isEmpty()) {
                for (Map.Entry<String, Integer> productEntry: product.entrySet()){
                    System.out.printf("  Product: %s, Price: %d%n", productEntry.getKey(), productEntry.getValue());
                }
            }
            else{
                System.out.print("  (No products)");
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inventoryString = scanner.nextLine();

        // Convert JSON string to Nested HashMap
        Type inventoryType = new TypeToken<HashMap<String, HashMap<String, Integer>>>(){}.getType();
        HashMap<String, HashMap<String, Integer>> inventory = new Gson().fromJson(inventoryString, inventoryType);

        printNestedInventory(inventory);
    }
}

// Test case
// {"Electronics": {"Laptop": 1200, "Smartphone": 800}, "Furniture": {"Chair": 50, "Table": 150}}
// {"Electronics": {}}