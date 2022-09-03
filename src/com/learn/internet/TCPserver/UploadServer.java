package com.learn.internet.TCPserver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Waiting!");
        Socket socket = serverSocket.accept();
        System.out.println("Success");

        String save = "src\\testCopy.jpeg";
        InputStream inputStream = socket.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(save);
        byte[] b = new byte[1024];
        int len = 0;
        while((len = inputStream.read(b)) != -1){
            fileOutputStream.write(b, 0, len);
        }

        OutputStream outputStream = socket.getOutputStream();
        String str = "Get it!";
        outputStream.write(str.getBytes());
        socket.shutdownOutput();

        outputStream.close();
        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
