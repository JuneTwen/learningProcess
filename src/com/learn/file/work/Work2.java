package com.learn.file.work;

import java.io.*;

public class Work2 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\code\\Note\\testFile.txt";
        int count = 1;
        BufferedReader bufferedReader =
                new BufferedReader(
                    new InputStreamReader(
                        new FileInputStream(path), "GBK"));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(count++ + "-" +line);
        }
        bufferedReader.close();
    }
}
