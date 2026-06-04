package com.java.practice.coddy;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class CoddyHashMapPt2 {
    public static String getCapital(HashMap<String, String> capitals, String country) {
        // Write your code below
        String result = capitals.get(country);
        return Objects.requireNonNullElse(result, "Not found");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();
        String country = scanner.nextLine();
//        {"USA": "Washington, D.C.", "France": "Paris", "Japan": "Tokyo", "Germany": "Berlin", "Brazil": "Brasília", "India": "New Delhi", "China": "Beijing", "Russia": "Moscow", "Canada": "Ottawa", "Australia": "Canberra"}
//         Australia
        // Convert String of HashMap to HashMap
        Type mapType = new TypeToken<HashMap<String, String>>(){}.getType();
        HashMap<String, String> countryCapitals = new Gson().fromJson(hashMapString, mapType);

        String result = getCapital(countryCapitals, country);
        System.out.println(result);
    }
}
