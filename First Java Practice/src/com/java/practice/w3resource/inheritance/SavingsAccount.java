package com.java.practice.w3resource.inheritance;

public class SavingsAccount extends BankAccount {

    private String name;
    private double balance;

    public SavingsAccount(String name, double balance) {
        super(name, balance);
        this.name = name;
        this.balance = balance;
    }


    @Override
    public void withdraw(double amount) {
        // Check if the withdrawal would cause the balance to drop below $100
        if (getBalance() - amount < 100) {
            // Print a message if the minimum balance requirement is not met
            System.out.println("Minimum balance of $100 required!");
        } else {
            // Call the parent class withdraw method
            super.withdraw(amount);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void getDetails() {
        System.out.println(name + " : " + balance);
    }
}
