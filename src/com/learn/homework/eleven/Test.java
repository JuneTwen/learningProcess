package com.learn.homework.eleven;

public class Test {
    public static void main(String[] args) {
        Person p = new Student(); //向上转型
        Person person = null;
        Student student = (Student)person;//向下转型

    }
}
