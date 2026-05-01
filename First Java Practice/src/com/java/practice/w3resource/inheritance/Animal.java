package com.java.practice.w3resource.inheritance;

public class Animal {
    public void makeSound(){
        System.out.println("making sound....");
    }
}

class AccessAnimal{
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.makeSound();
        Cat cat = new Cat();
        cat.makeSound();

    }
}
