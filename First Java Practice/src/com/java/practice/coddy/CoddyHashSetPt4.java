package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Scanner;

public class CoddyHashSetPt4 {
    public static void checkElement(HashSet<String> set, String element) {
        // Write your code here
        Boolean isPresent = set.contains(element);
        System.out.println(isPresent);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setString = scanner.nextLine();
        String element = scanner.nextLine();

        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);

        checkElement(set, element);
    }
}


// Test case
// ["Banana", "Grapes"]
// Mango