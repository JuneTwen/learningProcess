package com.learn.thread.exercise.topic01;

public class MainThread {
    public static void main(String[] args) {
        OutThread outThread = new OutThread();
        InputThread inputThread = new InputThread(outThread);
        new Thread(outThread).start();
        new Thread(inputThread).start();
    }
}
