package com.learn.file.outputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output {
    public static void main(String[] args) {
        String path = "D:\\code\\Note\\testFile.txt";
        FileOutputStream stream = null;
        FileInputStream readS = null;
        int temp = 0;
        try {
            // new FileOutputStream(path) 会覆盖原来的内容
            // new FileOutputStream(path,true) 追加内容

            stream = new FileOutputStream(path,true);
            String str = "hello world!";
            stream.write(str.getBytes());
            readS = new FileInputStream(path);
            while ((temp = readS.read()) != -1) {
                System.out.print((char) temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
