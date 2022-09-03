package com.learn.internet.home01;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        socket.shutdownOutput();

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = "";
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
