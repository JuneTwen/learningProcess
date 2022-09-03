package com.learn.internet.TCPclient;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class UploadClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        String path = "D:\\code\\Note\\test.jpeg";
        FileInputStream fileInputStream = new FileInputStream(path);
        OutputStream outputStream = socket.getOutputStream();
        byte[] b = new byte[1024];
        int len = 0;
        while((len = fileInputStream.read(b)) != -1){
            outputStream.write(b, 0, len);
        }
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int newLen = 0;
        while((newLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf, 0, newLen));
        }

        inputStream.close();
        outputStream.close();
        fileInputStream.close();
        socket.close();
    }
}
