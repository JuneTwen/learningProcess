package com.learn.internet.UCPreceive;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receive {
    public static void main(String[] args) throws IOException {
        // 在9999端口接收数据
        DatagramSocket socket = new DatagramSocket(9999);

        byte[] b = new byte[1024];
        DatagramPacket packet = new DatagramPacket(b, b.length);
        System.out.println("Waiting...");
        socket.receive(packet);
        System.out.println("Done");

        int len = packet.getLength();// 实际数据长度
        String str = new String(packet.getData(), 0, len);
        System.out.println(str);

        String reStr = "ok,see you";
        DatagramPacket packet1 =
                new DatagramPacket(reStr.getBytes(), reStr.length(), InetAddress.getByName("192.168.1.6"), 9998);
        socket.send(packet1);

        socket.close();
    }
}
