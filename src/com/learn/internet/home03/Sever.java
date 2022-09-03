package com.learn.internet.home03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;

public class Sever {
    public static void main(String[] args) throws IOException {
        // 初始化已存在music
        HashMap<String, File> music = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            String name = "music0" + i;
            File file = new File("D:\\code\\Note\\music\\"+name+".png");
            music.put(name, file);
        }
        // 建立服务端
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Loading...");
        Socket socket = serverSocket.accept();
        System.out.println("connected!");

        BufferedReader bufferedReader = // 读取文件名
                new BufferedReader(new InputStreamReader(socket.getInputStream()));

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        InputStream bis = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        String line = "";
        Set<String> keySet = music.keySet();

        while((line = bufferedReader.readLine()) != null) {
            for (String o : keySet) {
                if (o.equals(line)) {
                    System.out.println("get it");
                    bis = new FileInputStream(music.get(o));
                    byte[] temp = StreamUtils.toArray(bis);
                    bos.write(temp);
                    break;
                }
            }
        }

        baos.close();
        bis.close();
        bos.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
