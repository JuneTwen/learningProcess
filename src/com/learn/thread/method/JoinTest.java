package com.learn.thread.method;

public class JoinTest implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello "+i);
            delay(1000);
        }
        System.out.println("子线程结束");
    }
    public static void delay(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"- interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinTest test = new JoinTest();
        Thread thread = new Thread(test);
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                thread.start();
                thread.join();
            }
            System.out.println("hi "+i);
            JoinTest.delay(1000);
        }
        System.out.println("主线程结束");
    }
}
