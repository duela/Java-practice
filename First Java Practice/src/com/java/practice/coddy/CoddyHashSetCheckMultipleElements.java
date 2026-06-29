package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CoddyHashSetCheckMultipleElements {
    public static void checkMultipleElements(HashSet<String> set, ArrayList<String> elements) {
        // Write your code here

        for(String data : elements){
            System.out.println(set.contains(data));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setString = scanner.nextLine();
        String listString = scanner.nextLine();

        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);

        Type listType = new TypeToken<ArrayList<String>>(){}.getType();
        ArrayList<String> elements = new Gson().fromJson(listString, listType);

        checkMultipleElements(set, elements);
    }
}
