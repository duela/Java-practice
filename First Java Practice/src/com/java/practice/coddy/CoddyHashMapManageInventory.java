package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoddyHashMapManageInventory {
    public static HashMap<String, Object> processHashMap(HashMap<String, Double> products) {
        // Write your code here
        HashMap<String, Object> result = new HashMap<>();
        HashMap<String, Double> filter = new HashMap<>();
        double sum = 0;
        double highestPrice = 0;
        String highestProduct = "";
        boolean isEmpty = products.isEmpty();
        for (Map.Entry<String, Double> data : products.entrySet()){
            sum += data.getValue();
            if (highestPrice <= data.getValue()) {
                highestPrice = data.getValue();
                highestProduct = data.getKey();
            }
            if (data.getValue() > 50) {
                filter.put(data.getKey(), data.getValue());
            }

        }
        double averageProduct = sum / products.size();

        if (isEmpty) {
            averageProduct = 0;
        }
        result.put("Average", averageProduct);
        result.put("Highest", highestProduct);
        result.put("Filtered", filter);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productsString = scanner.nextLine();

        // Convert JSON string to HashMap
        Type mapType = new TypeToken<HashMap<String, Double>>(){}.getType();
        HashMap<String, Double> products = new Gson().fromJson(productsString, mapType);

        HashMap<String, Object> result = processHashMap(products);

        // Sort the Filtered map to ensure consistent output
        Map<String, Double> filteredMap = (Map<String, Double>) result.get("Filtered");
        if (filteredMap != null && !filteredMap.isEmpty()) {
            Map<String, Double> sortedFiltered = filteredMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (a, b) -> b,
                            LinkedHashMap::new
                    ));
            result.put("Filtered", sortedFiltered);
        }

        System.out.println(result);
    }
}



// Test case
// {"Lamp": 50.00,     "Table": 200.00,     "Chair": 75.00,     "Bookshelf": 300.00,     "Desk": 50.00 }
// {"TV": 500.00,     "Camera": 300.00,     "Speaker": 150.00,     "Headphones": 100.00,     "Projector": 400.00 }
// {}