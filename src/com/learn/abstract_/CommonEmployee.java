package com.learn.abstract_;

public class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("Common Employee "+super.getName()+" working!");
    }
}
