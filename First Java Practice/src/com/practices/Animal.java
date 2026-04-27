package com.practices;

public class Animal {
    public static  void getName(String name){
        System.out.println("Animal name is " + name);
    }
    public static void main(String[] args){
        getName("Dog");
        getName("Cat");
        getName("Goat");

    }
}
