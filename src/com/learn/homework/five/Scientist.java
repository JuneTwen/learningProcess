package com.learn.homework.five;

public class Scientist extends Staff{
    private double bonus;

    public Scientist(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public void showSalary() {
        System.out.println(this.getSalary() * 12 + this.bonus);
    }
}
