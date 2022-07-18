package com.learn.thread.exit;

public class Exit implements Runnable{
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        int index = 0;
        while (loop) {
            System.out.println(index++);
            try {
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Exit exit = new Exit();
        new Thread(exit).start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exit.setLoop(false);
    }
}
