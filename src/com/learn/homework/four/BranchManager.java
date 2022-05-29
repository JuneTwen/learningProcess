package com.learn.homework.four;

public class BranchManager extends Staff{
    private final static double salaryLevel = 1.2;
    private final static double bonus = 1000;
    public BranchManager(String name, double singleSalary, int days) {
        super(name, singleSalary, days);
    }

    @Override
    public double showSalary() {
        System.out.println(bonus + super.showSalary() * salaryLevel);
        return bonus + super.showSalary() * salaryLevel;
    }
}
