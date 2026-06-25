package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class CoddyHashMapProcessModify {
    public static HashMap<String, Integer> processHashMap(HashMap<String, Integer> data, String[] operations) {
        // Write your code here
        for (String key : operations) {
            String keyValue = key.split(" ")[1].trim();
            boolean checker = data.containsKey(keyValue);
            if (key.contains("GET")) {
                if (checker) {
                    System.out.println(data.get(keyValue));
                } else {
                    System.out.println("Not found");
                }

            }
            if (key.contains("CHECK")) {
                if (checker) {
                    System.out.println("Exists");
                } else {
                    System.out.println("Not found");

                }
            }
            if (key.contains("MODIFY")) {
                Integer modifyKeyValue = Integer.valueOf(key.split(" ")[2].trim());
                if (checker && Objects.equals(data.get(keyValue), modifyKeyValue)) {
                    data.replace(keyValue, modifyKeyValue + 1);
                } else if (checker) {
                    data.remove(keyValue);
                } else {
                    data.put(keyValue, modifyKeyValue);
                }
            }

        }


        // Second method

//
//        for (String operation : operations) {
//
//            String[] parts = operation.split(" ");
//
//            String command = parts[0];
//            String key = parts[1];
//
//            switch (command) {
//
//                case "GET":
//
//                    Integer value = data.get(key);
//
//                    if (value != null) {
//                        System.out.println(value);
//                    } else {
//                        System.out.println("Not found");
//                    }
//
//                    break;
//
//                case "CHECK":
//
//                    if (data.containsKey(key)) {
//                        System.out.println("Exists");
//                    } else {
//                        System.out.println("Not found");
//                    }
//
//                    break;
//
//                case "MODIFY":
//
//                    int targetValue =
//                            Integer.parseInt(parts[2]);
//
//                    Integer currentValue =
//                            data.get(key);
//
//                    if (currentValue == null) {
//
//                        data.put(key, targetValue);
//
//                    } else if (
//                            currentValue.equals(targetValue)
//                    ) {
//
//                        data.replace(
//                                key,
//                                targetValue + 1
//                        );
//
//                    } else {
//
//                        data.remove(key);
//
//                    }
//
//                    break;
//            }
//        }

        return data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();
        String operationsString = scanner.nextLine();

        // Convert String of HashMap to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> data = new Gson().fromJson(hashMapString, mapType);

        // Convert String of Array to Array
        String[] operations = new Gson().fromJson(operationsString, String[].class);

        HashMap<String, Integer> result = processHashMap(data, operations);
        System.out.println(new Gson().toJson(result));
    }
}

// Test case
//{"A": 10, "B": 20, "C": 30}
//        ["MODIFY B 20", "GET B"]

//{"Alice": 85, "Bob": 92}
//        ["GET Bob", "CHECK Charlie", "MODIFY Bob 92", "MODIFY Charlie 88"]
