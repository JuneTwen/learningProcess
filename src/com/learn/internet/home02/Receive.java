package com.learn.internet.home02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8889);

        byte[] b = new byte[1024];
        DatagramPacket newPacket = new DatagramPacket(b, b.length);

        socket.receive(newPacket);
        System.out.println(new String(newPacket.getData(), 0, newPacket.getLength()));

        String str = "Get it";
        DatagramPacket packet =
                new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("192.168.1.6"), 8888);
        socket.send(packet);

        socket.close();
    }
}
