package com.learn.homework.five;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker(3000);
        Farmer farmer = new Farmer(3000);
        Waiter waiter = new Waiter(3000);
        Teacher teacher = new Teacher(3000, 100);
        Scientist scientist = new Scientist(4000, 10000);
        worker.showSalary();
        farmer.showSalary();
        waiter.showSalary();
        teacher.showSalary();
        scientist.showSalary();

    }
}
