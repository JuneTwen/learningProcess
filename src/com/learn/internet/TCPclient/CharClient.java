package com.learn.internet.TCPclient;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class CharClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        String str = "Hello sever!";
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write(str);
        bw.newLine();
        bw.flush();
        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = "";
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        bw.close();
        socket.close();
    }
}
