package com.learn.homework.three;

public class Lecturer extends Teacher{
    public Lecturer(String name, int age) {
        super(name, age, "Lecturer", 1.1);
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}
