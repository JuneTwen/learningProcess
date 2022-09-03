package com.learn.internet.home04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;

public class Sever {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Loading...");
        Socket socket = serverSocket.accept();
        System.out.println("Connected!");

        // 初始化已存在music
        HashMap<String, String> music = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            String name = "music0" + i;
            String  path = "D:\\code\\Note\\music\\"+name+".png";
            music.put(name, path);
        }
        byte[] temp = null;
        BufferedReader br = // 字符流读取文件名
                new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String filename = "";
        while((filename = br.readLine()) != null) {
            Set<String> keySet = music.keySet();
            for (String o : keySet) {
                if (o.equals(filename)) {
                    FileInputStream fis = new FileInputStream(music.get(o));// 字节流读取文件
                    temp = StreamUtils.toArray(fis);
                    fis.close();
                    break;
                }
            }
        }


        OutputStream os = socket.getOutputStream();
        if (temp != null) {
            os.write(temp);
            os.close();
        }
        br.close();
        socket.close();
        serverSocket.close();

    }
}
