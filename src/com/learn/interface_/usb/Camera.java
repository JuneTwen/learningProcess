package com.learn.interface_.usb;

public class Camera implements Usb{

    @Override
    public void start() {
        System.out.println("Camera working.");
    }

    @Override
    public void stop() {
        System.out.println("Camera stop.");
    }
}
