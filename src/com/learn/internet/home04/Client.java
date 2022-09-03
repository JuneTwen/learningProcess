package com.learn.internet.home04;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        String filename = "music02";
        String path = "D:\\code\\Note\\"+filename+".png";

        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(filename);
        bw.flush();
        socket.shutdownOutput();


        InputStream is = socket.getInputStream();
        byte[] file = StreamUtils.toArray(is);

        FileOutputStream fos = new FileOutputStream(path);
        fos.write(file);

        fos.close();
        is.close();
        bw.close();
        socket.close();
    }
}
