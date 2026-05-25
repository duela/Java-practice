package com.java.practice.coddy;

public class CoddyUsernameChecker {
    public static String checkLength(String username){
        int usernameLength = username.length();
        boolean usernameValidity = usernameLength >= 6;
        return String.format("Username length: %d%n" +
                "Long enough: %b", usernameLength, usernameValidity);

    }
    public static String checkStart(String username){
        boolean checkStartWithUser = username.startsWith("user_");
        boolean checkStartWithAdmin = username.startsWith("admin_");
        return String.format("Starts with user_: %b%n" +
                "Starts with admin_: %b",checkStartWithUser, checkStartWithAdmin );
    }
    public static String modifyUsername(String username){
        String usernameFirstFiveCharacter = username.substring(0,5);
        return String.format("First 5 chars: %s%n" +
                "Uppercase: %s", usernameFirstFiveCharacter, usernameFirstFiveCharacter.toUpperCase() );

    }

    // Write your methods here
    public static void main(String[] args) {
        // Test with this username
        String username = "user_123admin";

        System.out.println("Length Check:");
        System.out.println(checkLength(username));

        System.out.println("\nPrefix Check:");
        System.out.println(checkStart(username));

        System.out.println("\nModified Username:");
        System.out.println(modifyUsername(username));
    }
}
