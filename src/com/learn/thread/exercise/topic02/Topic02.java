package com.learn.thread.exercise.topic02;

public class Topic02 implements Runnable{
    private static int money = 10000;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                if (money <= 0) {
                    System.out.println("No money!");
                    break;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName()
                        + " Draw money(1000) " + i + " Rest money: " + money);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Topic02 person1 = new Topic02();
        Topic02 person2 = new Topic02();
        new Thread(person1).start();
        new Thread(person2).start();
    }
}
