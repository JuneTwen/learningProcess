package com.learn.internet.TCPserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Waiting for the connection...");
        Socket socket = serverSocket.accept();
        System.out.println("Connected");

        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        while((len = inputStream.read(b)) != -1){
            System.out.println(new String(b, 0, len));
        }
        // socket.shutdownInput();

        OutputStream outputStream = socket.getOutputStream();
        String str = "Hello client";
        outputStream.write(str.getBytes());
        socket.shutdownOutput();

        socket.close();
        serverSocket.close();
        inputStream.close();
        outputStream.close();
    }
}
