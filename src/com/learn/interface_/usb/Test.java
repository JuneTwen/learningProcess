package com.learn.interface_.usb;

public class Test {
    public static void main(String[] args) {
        Camputer camputer = new Camputer();
        Camera camera = new Camera();
        Phone phone = new Phone();
        camputer.work(camera);
        camputer.work(phone);
    }
}
