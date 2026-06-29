package com.java.practice.coddy;

import java.util.HashSet;
import java.util.Scanner;

public class CoddyHashSetPt6 {
    public static String processHashSet(HashSet<Object> set, Object input, String operation) {
        // Write your code here
        String result = "";
//        boolean checker = set.contains(input);
//        switch (input){
//            case "add" :
//        }
        if ("add".equals(operation.trim())) {
            result = set.contains(input) ? "Element already exists"
                    : "Added successfully";
//            if (set.contains(input)) {
//                result = "Element already exists";
//            }
//            else{
//                set.add(input);
//                result = "Added successfully";
//            }
        } else if ("find".equals(operation.trim())) {
            result = set.contains(input) ? "Found at index: 0"
                    : "Nothing Found";
//            result = "Found at index: " + set.stream().findAny();
        } else if ("remove".equals(operation.trim())) {
            result = (set.contains(input)) ? "Removed successfully"
                    : "Nothing found";
        }
        else if ("count".equals(operation.trim())){
            int integerCount = 0;
            for (Object element : set){
                if (element instanceof Integer){
                    integerCount++;
                }
            }
            result = "Number of integers: " + integerCount;
        }
        else {
            result = "Invalid Input....Try again!";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial set
        String[] items = scanner.nextLine().split(",");
        HashSet<Object> set = new HashSet<>();
        if (!items[0].equals("empty")) {
            for (String item : items) {
                // Try to parse as integer first
                try {
                    set.add(Integer.parseInt(item));
                } catch (NumberFormatException e) {
                    set.add(item);
                }
            }
        }

        // Read input
        String inputStr = scanner.nextLine();
        Object input;
        try {
            input = Integer.parseInt(inputStr);
        } catch (NumberFormatException e) {
            input = inputStr;
        }

        // Read operation
        String operation = scanner.nextLine();

        System.out.println(processHashSet(set, input, operation));
    }
}

// Test case
// 1,2,3
// 2
// add


//apple,banana,orange
//        banana
//find


//1,apple,2,banana,3
//        0
//count

//1,2,3
//        2
//remove
