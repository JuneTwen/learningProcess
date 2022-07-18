package com.learn.thread.method;

public class Method implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            delay(1000);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            delay(1000);
        }
    }

    public void delay(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"- interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Method method = new Method();
        Thread thread = new Thread(method);
        thread.setName("testTread");
        thread.start();
        for (int i = 0; i < 10; i++) {
            if (i > 5) {
                thread.join();
            }
            System.out.println(i+"--"+Thread.currentThread().getName());
            method.delay(1000);
        }

    }
}
