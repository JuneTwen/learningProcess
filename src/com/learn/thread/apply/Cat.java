package com.learn.thread.apply;

public class Cat extends Thread{
    @Override
    public void run() {
        int index = 0;
        while (true) {
            System.out.println("----" + (index++)
                    +Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (index == 8){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start(); // 启动线程
        // 当 main 线程启动一个子线程 Thread-0 ,主线程不会阻塞,会继续执行
        // 主线程与子线程交替执行
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main Thread");
        }
    }
}
