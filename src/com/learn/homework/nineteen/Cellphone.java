package com.learn.homework.nineteen;

public class Cellphone implements Calculate{

    @Override
    public void work() {
        System.out.println("work");
    }
    public void testWork(Calculate cal){
        cal.work();
    }

    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculate() {
            @Override
            public void work() {
                System.out.println("new work");
            }
        });
    }
}
