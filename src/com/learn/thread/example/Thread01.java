package com.learn.thread.example;

public class Thread01 implements Runnable{
    @Override
    public void run() {
        for (int i = 0 ; i < 50; i++) {
            System.out.println("hi"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
