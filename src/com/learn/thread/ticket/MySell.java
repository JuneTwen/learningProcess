package com.learn.thread.ticket;

public class MySell implements Runnable {
    private int ticketNum = 100;
    private boolean loop = true;

    public boolean temp(){ //同步方法
        synchronized (this) {
            if (ticketNum <= 0){
                System.out.println("There is no ticket!");
                return false;
            }
            System.out.println(Thread.currentThread().getName()
                    + ": " + "rest ticket: " + --ticketNum);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }
    }
    @Override
    public void run() {
        while(loop){
            loop = temp();
        }
    }

    public static void main(String[] args) {
        MySell mySell = new MySell();
        new Thread(mySell).start();
        new Thread(mySell).start();
        new Thread(mySell).start();
    }
}
