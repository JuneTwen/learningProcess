package com.learn.internet.home02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8888);
        String send = "Send to receive";
        DatagramPacket packet =
                new DatagramPacket(send.getBytes(), send.length(), InetAddress.getByName("192.168.1.6"),8889);
        ds.send(packet);

        byte[] b = new byte[1024];
        DatagramPacket newPacket = new DatagramPacket(b, b.length);
        ds.receive(newPacket);
        System.out.println(new String(newPacket.getData(), 0, newPacket.getLength()));
        ds.close();
    }
}
