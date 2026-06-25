package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoddyHashMapManageWarehouse {
    public static void manageWarehouse(HashMap<String, Integer> warehouse, String[] operations) {
        for (String operation : operations) {
            // Split the operation string by spaces
            String[] parts = operation.split(" ");
            String command = parts[0];

            if (command.equals("ADD")) {
                String product = parts[1];
                int quantity = Integer.valueOf(parts[2]);

                // Get existing quantity or default to 0, then add the new quantity
                int currentQty = warehouse.getOrDefault(product, 0);
                warehouse.put(product, currentQty + quantity);

            } else if (command.equals("REMOVE")) {
                String product = parts[1];
                int quantity = Integer.valueOf(parts[2]);

                if (warehouse.containsKey(product)) {
                    int currentQty = warehouse.get(product);
                    int newQty = currentQty - quantity;

                    // Remove item completely if balance drops to 0 or below
                    if (newQty <= 0) {
                        warehouse.remove(product);
                    } else {
                        warehouse.put(product, newQty);
                    }
                }

            } else if (command.equals("CHECK")) {
                String product = parts[1];
                // Prints true if exists, false otherwise
                System.out.println(warehouse.containsKey(product));

            } else if (command.equals("PRINT")) {
                // Iterates and prints all key-value entries in the requested format
                for (Map.Entry<String, Integer> entry : warehouse.entrySet()) {
                    System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
                }
            }
        }

        System.out.println(Arrays.toString(operations));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String warehouseString = scanner.nextLine();
        String operationsString = scanner.nextLine();

        // Convert JSON string to HashMap

        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> warehouse = new Gson().fromJson(warehouseString, mapType);

        // Convert JSON string to Array
        String[] operations = new Gson().fromJson(operationsString, String[].class);

        manageWarehouse(warehouse, operations);
    }
}


// test case
// {"Laptop": 10, "Mouse": 50}
// ["ADD Keyboard 30", "REMOVE Mouse 20", "CHECK Laptop", "REMOVE Laptop 10", "CHECK Laptop", "PRINT"]