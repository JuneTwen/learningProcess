package com.learn.homework.three;

public class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }
    public void introduce(){
        System.out.println("name:\t"+this.name
                +"\tage:\t"+this.age
                +"\tpost:\t"+this.post
                +"\tsalary\t"+this.salary);
    }
}
