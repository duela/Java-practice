package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Scanner;

public class CoddyHashMapPt4KeySetFilter {
    public static void printFilteredInventoryKeySet(HashMap<String, Integer> inventory) {
        // Write your code here using keySet()
        boolean foundAny = false;
        for (String data : inventory.keySet()){
            int quantity = inventory.get(data);

            if (quantity > 20){
                System.out.printf("Product: %s, Quantity: %d%n", data, quantity);
                foundAny = true;
            }
        }
        if (!foundAny) {
            System.out.print("No products with quantity greater than 20.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string input representing the inventory HashMap
        String inventoryString = scanner.nextLine();

        // Convert JSON string to HashMap<String, Integer>
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printFilteredInventoryKeySet(inventory);
    }
}
