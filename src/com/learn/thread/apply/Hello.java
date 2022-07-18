package com.learn.thread.apply;

public class Hello implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi!" + " " + i
                    + "-" +Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        Hello hello = new Hello();

        Thread thread = new Thread(hello);
        thread.start();
    }
}
