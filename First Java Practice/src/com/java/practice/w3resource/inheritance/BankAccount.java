package com.java.practice.w3resource.inheritance;

public class BankAccount {
    private final String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
        }
       return balance;
    }
    public void withdraw(double amount){
        if (balance > 0 && amount > 0 && balance >= amount) {
            this.balance -= amount;
            System.out.printf("Available balance: %.2f%n" ,balance);

        } else {
            System.out.println("Insufficient balance");
        }

    }

    public void getDetails() {
        System.out.println(name + " : " + balance);
    }

    public double getBalance(){
        return balance;
    }

}

class AccessBankAccount{
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("Glory", 2000.00);
        bankAccount.getDetails();
        double deposit = bankAccount.deposit(3000.50);
        System.out.printf("Deposited successfully! balance is $%.2f %n", deposit);

        bankAccount.withdraw(500);
//

        SavingsAccount savingsAccount = new SavingsAccount("Dave", 1950);
        savingsAccount.getDetails();

        System.out.printf("Balance is $%.2f%n", savingsAccount.getBalance());
        savingsAccount.withdraw(1800);
    }
}
