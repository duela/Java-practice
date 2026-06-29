package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Scanner;

public class CoddyHashSetUnionSet {
    public static void unionSets(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Write your code here
        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string representing the first set (e.g., [1,2])
        String set1String = scanner.nextLine();
        // Read JSON string representing the second set (e.g., [2,3])
        String set2String = scanner.nextLine();

        Type setType = new TypeToken<HashSet<Integer>>(){}.getType();
        HashSet<Integer> set1 = new Gson().fromJson(set1String, setType);
        HashSet<Integer> set2 = new Gson().fromJson(set2String, setType);

        unionSets(set1, set2);
    }
}

// Test case
//[1,2]
//[2,3]

//[4,5,6]
//[1,2,3]