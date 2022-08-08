package com.learn.thread.exercise.topic01;

import java.util.Scanner;

public class InputThread implements Runnable{
    private OutThread out;
    private Scanner scanner = new Scanner(System.in);

    public InputThread(OutThread out) {
        this.out = out;
    }

    @Override
    public void run() {
        while (true) {
            String str = scanner.next();
            if (str.equals("Q")){
                out.setLoop(str);
                break;
            }
        }
    }
}
