package com.learn.test;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public String say(){
        return super.say() + "\t" + salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
