package com.learn.thread.daemon;

public class Daemon implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("Thread loading...");
            delay(1000);
        }
    }
    public static void delay(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"- interrupted");
        }
    }

    public static void main(String[] args) {
        Daemon daemon = new Daemon();
        Thread thread = new Thread(daemon);
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main loading...");
            Daemon.delay(1000);
        }
        System.out.println("Main end");
    }
}
