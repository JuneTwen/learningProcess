package com.learn.homework.five;

public class Teacher extends Staff{
    private double dues;

    public Teacher(double salary, double dues) {
        super(salary);
        this.dues = dues;
    }

    @Override
    public void showSalary() {
        System.out.println(this.getSalary() * 12 + dues * 365);
    }
}
