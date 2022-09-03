package com.learn.internet.home03;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Receive {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedInputStream bufferedInputStream =
                new BufferedInputStream(socket.getInputStream());


        String fileName = "music01";
        bufferedWriter.write(fileName);
        bufferedWriter.flush();
        socket.shutdownOutput();


        String path = "D:\\code\\Note\\" + fileName + ".png";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(path));
        byte[] b = new byte[1024];
        int len;
        while((len = bufferedInputStream.read(b)) != -1){
            bufferedOutputStream.write(b, 0, len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        bufferedWriter.close();
        socket.close();
    }
}
