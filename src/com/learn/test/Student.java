package com.learn.test;

public class Student extends Person{
    private int scroe;

    public Student(String name, int age, int scroe) {
        super(name, age);
        this.scroe = scroe;
    }

    @Override
    public String say() {
        return super.say() + "\t" +scroe;
    }

    public int getScroe() {
        return scroe;
    }

    public void setScroe(int scroe) {
        this.scroe = scroe;
    }
}
