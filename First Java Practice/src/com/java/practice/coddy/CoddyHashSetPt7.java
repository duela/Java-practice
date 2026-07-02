package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Scanner;

public class CoddyHashSetPt7 {
    public static void printSet(HashSet<String> set) {
        // Write your code here using a for-each loop
        int count = 0;
        for (String data : set ){
            count++;
            System.out.println(data);
        }
        System.out.println("Total elements: " + count);

        outer: for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(i * j == 4) {
                    break outer;
                }
                System.out.println(i + "," + j);
            }
        }

        firstLoop: for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(j == 1) {
                    continue firstLoop;
                }
                System.out.println(i + "," + j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read a JSON string representing a HashSet of strings, e.g., ["Apple","Banana","Cherry"]
        String setString = scanner.nextLine();

        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> mySet = new Gson().fromJson(setString, setType);

        printSet(mySet);
    }
}

// Test case
//["Apple", "Banana", "Cherry"]
// ["Red", "Green", "Blue"]
//["Orange", "Grape"]