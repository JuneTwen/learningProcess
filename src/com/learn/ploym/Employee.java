package com.learn.ploym;

public class Employee {
    private String name;
    private int monthlySalary;

    public Employee(String name, int monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public int getAnnual(){
        return monthlySalary*12;
    }
}
