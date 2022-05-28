package com.learn.ploym;

public class Staff extends Employee{
    public Staff(String name, int monthlySalary) {
        super(name, monthlySalary);
    }
    public void work(){
        System.out.println("work person!");
    }

    @Override
    public int getAnnual() {
        return super.getAnnual();
    }
}
