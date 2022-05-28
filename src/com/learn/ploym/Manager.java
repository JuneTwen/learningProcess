package com.learn.ploym;

public class Manager extends Employee{
    private int bonus;

    public Manager(String name, int monthlySalary, int bonus) {
        super(name, monthlySalary);
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("manage person!");
    }

    @Override
    public int getAnnual() {
        return super.getAnnual() + bonus;
    }
}
