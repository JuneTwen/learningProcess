package com.learn.file.translate;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Translate {
    public static void main(String[] args) throws IOException {
        String path = "D:\\code\\Note\\testFile.txt";

        BufferedReader br = new BufferedReader(
                new InputStreamReader
                        (new FileInputStream(path),"gbk"));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
//        int len = 0;
//        byte[] b = new byte[8];
//        while((len = bis.read(b)) != -1){
//            System.out.println(new String(b, 0, len));
//        }
    }
}
