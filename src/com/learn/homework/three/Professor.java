package com.learn.homework.three;

public class Professor extends Teacher{
    public Professor(String name, int age) {
        super(name, age, "Professor", 1.3);
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}
