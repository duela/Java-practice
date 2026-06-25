package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Scanner;

public class CoddyHashMapModify {
    public static HashMap<String, Integer> modifyMap(HashMap<String, Integer> data, String key, int newValue) {
        // Write your code here
        boolean checker = data.containsKey(key);
        Integer dataKey = data.get(key);
        if (checker && dataKey == newValue) {
            int value = dataKey + 1;
            data.replace(key, value);
        } else if (checker && dataKey != newValue) {
            data.remove(key);
        }
        else {
            data.put(key, newValue);
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();
        String key = scanner.nextLine();
        int newValue = scanner.nextInt();

        // Convert String of HashMap to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> data = new Gson().fromJson(hashMapString, mapType);

        HashMap<String, Integer> result = modifyMap(data, key, newValue);
        System.out.println(new Gson().toJson(result));
    }
}

//Test case
//{"Alice": 85, "Bob": 92}
//Bob
//95
