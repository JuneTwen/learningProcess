package com.learn.thread.syn;

public class Deadlock implements Runnable{
    private static Object o1 = new Object();
    private static Object o2 = new Object();
    boolean loop;

    public Deadlock(boolean loop) {
        this.loop = loop;
    }

    @Override
    public  void run() {
        if (loop){

            synchronized (o1){
                System.out.println("to "+Thread.currentThread().getName());
                synchronized (o2){
                    System.out.println("to "+Thread.currentThread().getName());
                }
            }
        } else {
            synchronized (o2){
                System.out.println("to "+Thread.currentThread().getName());
                synchronized (o1){
                    System.out.println("to "+Thread.currentThread().getName());
                }
            }
        }

    }

    public static void main(String[] args) {
        Deadlock T = new Deadlock(true);
        Deadlock F = new Deadlock(false);
        new Thread(T).start();
        new Thread(F).start();
    }
}
