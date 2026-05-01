package com.java.practice.w3resource.encapsulate;

import java.math.BigDecimal;

public class BankAccount {
    private String accountNumber;
    private BigDecimal balance;

    public BankAccount(String accountNumber, BigDecimal balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance(){
        return balance;
    }

    public void setBalance(BigDecimal balance){
        this.balance = balance;
    }
}

class AccessBankAccount{
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("DE123456789", BigDecimal.valueOf(0.00));
        System.out.printf("The account balance for %s is $%.2f: %n", bankAccount.getAccountNumber(), bankAccount.getBalance());
        bankAccount.setAccountNumber("LT1234560000");
        bankAccount.setBalance(BigDecimal.valueOf(5));
        System.out.printf("The account balance for %s is $%.2f:", bankAccount.getAccountNumber(), bankAccount.getBalance());

    }
}
