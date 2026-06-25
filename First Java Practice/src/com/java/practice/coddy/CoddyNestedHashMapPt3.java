package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoddyNestedHashMapPt3 {
    public static void printMostExpensiveProducts(HashMap<String, HashMap<String, Integer>> inventory) {
        // Write your code here


        for (Map.Entry<String, HashMap<String, Integer>> data : inventory.entrySet()){
            String category = data.getKey();
            int maxValue = 0;

            System.out.printf("Category: %s%n", category);
            Map<String, Integer> product = data.getValue();
            if (!product.isEmpty()) {
                String maxProduct = "";
                for (Map.Entry<String, Integer> productEntry : product.entrySet()){
                    if (maxValue < productEntry.getValue()) {
                        maxValue = productEntry.getValue();
                        maxProduct = productEntry.getKey();


                    }

                }
                System.out.printf("  Most Expensive Product: %s, Price: %d%n", maxProduct,  maxValue);

            }
            else {
                System.out.print("  No products available.");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inventoryString = scanner.nextLine();

        // Convert JSON string to Nested HashMap
        Type inventoryType = new TypeToken<HashMap<String, HashMap<String, Integer>>>(){}.getType();
        HashMap<String, HashMap<String, Integer>> inventory = new Gson().fromJson(inventoryString, inventoryType);

        printMostExpensiveProducts(inventory);
    }
}
// Test case
// [["Electronics", [["Laptop", 1200], ["Smartphone", 800]]], ["Furniture", [["Chair", 50], ["Table", 150]]]]
// [["Toys", [["Doll", 20], ["Car", 10]]], ["Appliances", []]]