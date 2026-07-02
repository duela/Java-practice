package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Scanner;

public class CoddySwitchExpressionArrowOperatorPt6 {
    public static String processArray(Object[] data, String type) {
        // Write your code here
        if (data == null || data.length == 0) {
            return "Invalid input";
        }
        if (type == null || (!type.equals("sum") && !type.equals("find"))) {
            return "Invalid type";
        }

        // 2. Use switch expression with arrow syntax
        return switch (type) {
            case "sum" -> {
                double totalSum = 0;

                for (Object obj : data) {
                    // Pattern matching for modern Java casting
                    if (obj instanceof Integer i) {
                        totalSum += i;
                    } else if (obj instanceof Double d) {
                        totalSum += d;
                    }
                }

                // Format output cleanly: remove decimal if it's a whole number
                if (totalSum == (long) totalSum) {
                    yield "Sum: " + (long) totalSum;
                } else {
                    yield "Sum: " + totalSum;
                }
            }

            case "find" -> {
                String searchResult = "Not found";

                // 3. Labeled loop for control flow
                searchLoop: for (int i = 0; i < data.length; i++) {
                    Object obj = data[i];
                    double value = 0;
                    boolean isNumeric = false;

                    // Instanceof pattern matching to safely extract numeric values
                    if (obj instanceof Integer integerVal) {
                        value = integerVal;
                        isNumeric = true;
                    } else if (obj instanceof Double doubleVal) {
                        value = doubleVal;
                        isNumeric = true;
                    }

                    // 4. Labeled loop control criteria
                    if (isNumeric && value > 100) {
                        searchResult = String.valueOf(i);
                        break searchLoop; // Breaks directly out of our labeled loop
                    }
                }
                yield searchResult;
            }

            default -> "Invalid type";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataJson = scanner.nextLine();
        String type = scanner.nextLine();

        Type arrayType = new TypeToken<Object[]>(){}.getType();
        Object[] data = new Gson().fromJson(dataJson, arrayType);

        System.out.println(processArray(data, type));
    }
}

// test case
//[100, "text", 50.5, 30]
//sum

//[50, "text", 90, 30]
//find

//null
//sum