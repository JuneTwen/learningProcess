package com.learn.interface_.usb;

public class Phone implements Usb{
    @Override
    public void start() {
        System.out.println("Phone working.");
    }

    @Override
    public void stop() {
        System.out.println("Phone stop.");
    }
}
