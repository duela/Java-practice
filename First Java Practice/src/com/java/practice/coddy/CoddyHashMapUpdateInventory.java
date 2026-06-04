package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Scanner;

public class CoddyHashMapUpdateInventory {
    public static void updateInventory(HashMap<String, Integer> inventory, String productName, int quantityToAdd) {
        // Write your code here:
        // If productName already exists in inventory, add quantityToAdd to its current value.
        // If productName does not exist, add it with quantityToAdd as its value.
        boolean productChecker = inventory.containsKey(productName);
        if (productChecker) {
            int initialPoductQuantity = inventory.get(productName);
            inventory.put(productName, (initialPoductQuantity + quantityToAdd));
        }
        else{
            inventory.put(productName,  quantityToAdd);
        }

        // Prints the updated inventory as JSON — do not remove this line
        System.out.println(new Gson().toJson(inventory));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inventoryString = scanner.nextLine();
        String productName = scanner.nextLine();
        int quantityToAdd = scanner.nextInt();

        // Convert JSON string to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        updateInventory(inventory, productName, quantityToAdd);
    }
}
