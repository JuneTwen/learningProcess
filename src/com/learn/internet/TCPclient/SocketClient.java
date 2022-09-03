package com.learn.internet.TCPclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        String str = "Hello sever";

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(str.getBytes());
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        while((len = inputStream.read(b)) != -1){
            System.out.println(new String(b, 0, len));
        }
        // socket.shutdownInput();

        socket.close();
        outputStream.close();
        inputStream.close();
    }
}
