package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Scanner;

public class CoddyHashSetIntersectionSetPt2 {
    public static void intersectionWithSubsetCheck(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Write your code here
        HashSet<Integer> intersection =
                new HashSet<>(set1);

        intersection.retainAll(set2);

        System.out.println("Intersection: " + intersection);

        if (intersection.isEmpty()) {

            System.out.println("No common elements.");

        } else if (intersection.equals(set1)) {

            System.out.println("Set 1 is fully contained in Set 2");

        } else if (intersection.equals(set2)) {

            System.out.println("Set 2 is fully contained in Set 1");

        } else {

            System.out.println("Partial intersection");
        }
        // Initial solution
//        HashSet<Integer> intersectionSet = new HashSet<>(set1);
//        intersectionSet.retainAll(set2);
//        String intersection = "Intersection: ";
//        String result = "No common elements.";
//        boolean isEmpty = (set1.isEmpty() && set2.isEmpty());
//
//        if (isEmpty) {
//            intersection += intersectionSet;
//        }
//        else{
//            if (intersectionSet.size() > 0) {
//                if (set1.size() <= set2.size()) {
//                    if (intersectionSet.size() == set1.size()) {
//                        result = "Set 1 is fully contained in Set 2";
//                    }
//                    else {
//                        result = "Partial intersection";
//                    }
//                    intersection += intersectionSet;
//                }
//                else {
//                    if (intersectionSet.size() == set2.size()) {
//                        result = "Set 2 is fully contained in Set 1";
//                    }
//                    else {
//                        result = "Partial intersection";
//                    }
//                    intersection += intersectionSet;
//                }
//            }
//            else {
//                intersection += intersectionSet;
//            }
//
//        }
//
//        System.out.println(intersection);
//        System.out.println(result);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string for the first set (e.g., [1,2])
        String set1String = scanner.nextLine();
        // Read JSON string for the second set (e.g., [2,3])
        String set2String = scanner.nextLine();

        Type setType = new TypeToken<HashSet<Integer>>(){}.getType();
        HashSet<Integer> set1 = new Gson().fromJson(set1String, setType);
        HashSet<Integer> set2 = new Gson().fromJson(set2String, setType);

        intersectionWithSubsetCheck(set1, set2);
    }
}


// Test case

//[]
//[]

//[1, 2]
//[1, 2, 3, 4]

//[10, 20, 30]
//[30, 40, 50]
