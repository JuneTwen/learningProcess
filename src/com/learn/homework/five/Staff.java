package com.learn.homework.five;

public class Staff {
    private double salary;

    public Staff(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public void showSalary(){
        System.out.println(salary * 12);
    }
}
