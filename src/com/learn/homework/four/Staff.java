package com.learn.homework.four;

public class Staff {
    private String name;
    private double singleSalary;
    private int days;

    public Staff(String name, double singleSalary, int days) {
        this.name = name;
        this.singleSalary = singleSalary;
        this.days = days;
    }

    public double showSalary(){
        return singleSalary * days;
    }
}
