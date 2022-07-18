package com.learn.thread.ticket;

public class Sell implements Runnable{
    private int ticketNum = 100;
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(--ticketNum +"-"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public static void main(String[] args) {
        Sell sell = new Sell();
        Thread thread1 = new Thread(sell);
        thread1.setName("No.1");
        Thread thread2 = new Thread(sell);
        thread2.setName("No.2");
        Thread thread3 = new Thread(sell);
        thread3.setName("No.3");


        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println(sell.getTicketNum());
    }
}
