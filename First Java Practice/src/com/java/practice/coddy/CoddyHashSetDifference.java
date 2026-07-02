package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Scanner;

public class CoddyHashSetDifference {
    public static void setDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Write your code here
        HashSet<Integer> setDifference = new HashSet<>(set1);
        setDifference.removeAll(set2);
        System.out.println("Difference: " + setDifference);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string representing the first set (e.g., [1,2,3])
        String set1String = scanner.nextLine();
        // Read JSON string representing the second set (e.g., [2,3,4])
        String set2String = scanner.nextLine();

        Type setType = new TypeToken<HashSet<Integer>>(){}.getType();
        HashSet<Integer> set1 = new Gson().fromJson(set1String, setType);
        HashSet<Integer> set2 = new Gson().fromJson(set2String, setType);

        setDifference(set1, set2);
    }
}

// Test case
//[10,20,30,40]
//[20,40,50,60]