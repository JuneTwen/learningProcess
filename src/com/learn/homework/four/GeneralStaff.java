package com.learn.homework.four;

public class GeneralStaff extends Staff{
    private final static double salaryLevel = 1.0;
    public GeneralStaff(String name, double singleSalary, int days) {
        super(name, singleSalary, days);
    }

    @Override
    public double showSalary() {
        System.out.println(super.showSalary() * salaryLevel);
        return super.showSalary() * salaryLevel;
    }
}
