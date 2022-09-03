package com.learn.internet.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Internet {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println(localhost);
        InetAddress byName = InetAddress.getByName("www.github.com");
        System.out.println(byName.getHostName());
    }
}
