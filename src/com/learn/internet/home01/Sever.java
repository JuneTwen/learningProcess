package com.learn.internet.home01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public static void main(String[] args) throws IOException {
        String name = "我是 nova";
        String hobby = "编写 java 程序";
        String sth = "Error!";
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Waiting...");
        Socket socket = serverSocket.accept();
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = "";
        String receive = "";
        while((line = bufferedReader.readLine()) != null){
            if (line.equals("name")){
                receive = name;
            } else if (line.equals("hobby")) {
                receive = hobby;
            } else {
                receive = sth;
            }
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write(receive);
        bufferedWriter.flush();
        socket.shutdownOutput();

        bufferedWriter.close();
    }
}
