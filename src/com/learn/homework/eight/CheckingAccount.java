package com.learn.homework.eight;

public class CheckingAccount {
    private double balance;
    public CheckingAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        this.balance += (amount-1);
    }
    public void withdraw(double amount){
        this.balance -= (amount+1);
    }
}
