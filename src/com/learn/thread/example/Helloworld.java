package com.learn.thread.example;


public class Helloworld implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 60 ;i++) {
            System.out.println("hello,world"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
