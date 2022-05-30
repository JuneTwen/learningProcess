package com.learn.homework.eight;

public class SavingAccount {
    private double balance;
    private int freeOpportunities = 0;
    public SavingAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        int i = 1;
        if(freeOpportunities > 0) i = 0;
        this.balance += (amount - i);
    }
    public void withdraw(double amount){
        int i = 1;
        if(freeOpportunities > 0) i = 0;
        this.balance -= (amount + i);
    }
    public void earnMonthlyInterest(int month){
        if(month > 3){
            this.freeOpportunities = month / 3;
        }
        this.balance -= month * 0.1;
    }
}
