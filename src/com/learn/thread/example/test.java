package com.learn.thread.example;

public class test {
    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        Helloworld helloworld = new Helloworld();
        new Thread(thread01).start();
        new Thread(helloworld).start();
    }
}
