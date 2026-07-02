package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Scanner;

public class CoddyHashSetDifferencePt2 {
    public static void twoWaySetDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Write your code here
        HashSet<Integer> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2);
        HashSet<Integer> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);
        if (difference1.isEmpty() && difference2.isEmpty()) {
            System.out.println("No difference between sets.");

        } else {
            System.out.println(
                    "Difference (Set 1 - Set 2): "
                            + difference1);
            System.out.println(
                    "Difference (Set 2 - Set 1): "
                            + difference2);
        }
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

        twoWaySetDifference(set1, set2);
    }
}

// test case
// []
//[]

//[1, 2, 3]
//[2, 3, 4]

//[5, 6, 7]
//[7, 8, 9]

//[10, 20, 30]
//[10, 20, 30]

//[100]
//[200, 300]