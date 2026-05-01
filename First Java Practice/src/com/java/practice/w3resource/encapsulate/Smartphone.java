package com.java.practice.w3resource.encapsulate;

public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    public int increaseStorageCapacity(int increase){
        if (storageCapacity % increase == 0) {
            this.storageCapacity += increase;
        }
        return storageCapacity;
    }
}

class AccessSmartphone{
    public static void main(String[] args){
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("iPhone");
        smartphone.setModel("15Pro Max");
        smartphone.setStorageCapacity(254);

        System.out.printf("The %s %s has a capacity of %dGB%n",
                smartphone.getBrand(),
                smartphone.getModel(),
                smartphone.getStorageCapacity());
        int initialStorage = smartphone.getStorageCapacity();
        int increasedStorage = smartphone.increaseStorageCapacity(256);
        if (increasedStorage != initialStorage) {
            System.out.printf("Congratulations! your %s %s storage has being increased from %dGB to %dGB%n",
                    smartphone.getBrand(),
                    smartphone.getModel(),
                    initialStorage,
                    increasedStorage
            );
        }
        else{
            System.out.println("sorry, phone storage cannot be increased.");
        }


    }
}
