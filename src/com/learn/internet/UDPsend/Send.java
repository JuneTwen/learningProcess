package com.learn.internet.UDPsend;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {
    public static void main(String[] args) throws IOException {
        String str = "Hello receive!";
        // 在9998端口接收数据
        DatagramSocket socket = new DatagramSocket(9998);
        DatagramPacket packet =
                new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("192.168.1.6"), 9999);
        socket.send(packet);

        byte[] b = new byte[1024];
        DatagramPacket packet1 = new DatagramPacket(b, b.length);
        socket.receive(packet1);
        System.out.println(new String(packet1.getData(),0, packet1.getLength()));

        socket.close();
    }
}
