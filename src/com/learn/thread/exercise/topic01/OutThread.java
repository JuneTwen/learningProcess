package com.learn.thread.exercise.topic01;

import java.util.Random;

public class OutThread implements Runnable {
    private  String loop = "A";

    public void setLoop(String loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true){
            if (loop.equals("Q")) {
                break;
            }
            synchronized (this) {
                System.out.println(random.nextInt(100));

                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
