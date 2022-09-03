package com.learn.internet.TCPserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class CharServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Waiting...");
        Socket socket = serverSocket.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = "";
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String str = "Hello client";
        bw.write(str);
        bw.newLine();
        bw.flush();
        socket.shutdownOutput();

        bw.close();
        br.close();
        socket.close();
        serverSocket.close();

    }
}
