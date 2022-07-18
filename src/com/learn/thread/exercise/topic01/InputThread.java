package com.learn.thread.exercise.topic01;

import java.util.Scanner;

public class InputThread implements Runnable{
    private OutThread out;

    public InputThread(OutThread out) {
        this.out = out;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        out.setLoop(scanner.next());
    }
}
