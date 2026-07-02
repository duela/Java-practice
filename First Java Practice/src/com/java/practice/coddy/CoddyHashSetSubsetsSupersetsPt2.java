package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Scanner;

public class CoddyHashSetSubsetsSupersetsPt2 {
    public static void checkProperSubsetSuperset(HashSet<String> setA, HashSet<String> setB) {
        // Write your code here
        boolean isSubset = setB.containsAll(setA);
        boolean isReverseSubset = setA.containsAll(setB);
        boolean isProperSubSet = false;
        boolean isProperSuperSet = false;

        if (isSubset && setB.size() > setA.size()) {
            isProperSubSet = true;
        }
        if (isReverseSubset && setA.size() > setB.size()) {
            isProperSuperSet = true;
        }
        System.out.println("setA is a subset of setB: " + isSubset);
        System.out.println("setA is a superset of setB: " + isReverseSubset);
        System.out.println("setA is a proper subset of setB: " + isProperSubSet);
        System.out.println("setA is a proper superset of setB: " + isProperSuperSet);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setAString = scanner.nextLine();
        String setBString = scanner.nextLine();

        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> setA = new Gson().fromJson(setAString, setType);
        HashSet<String> setB = new Gson().fromJson(setBString, setType);

        checkProperSubsetSuperset(setA, setB);
    }
}

// Test case
//["apple", "banana"]
//["apple", "banana", "cherry"]

//["apple", "banana", "cherry"]
//["apple", "banana"]

//["cat", "dog"]
//["cat", "dog", "fish"]

//["A", "B", "C"]
//["A", "B", "C"]

//["one", "two"]
//["three", "four"]


