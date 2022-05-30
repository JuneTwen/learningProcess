package com.learn.homework.thirteen;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    @Override
    public String play() {
        return this.getName()+"爱玩象棋";
    }
    public void teach(){
        System.out.println("我承诺，我会认真教学。");
    }
}
