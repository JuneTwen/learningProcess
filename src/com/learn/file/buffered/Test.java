package com.learn.file.buffered;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        String path = "D:\\code\\Note\\testFile.txt";
        String line;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        bufferedWriter = new BufferedWriter(new FileWriter(path,true));
        bufferedWriter.write("qwert");
        bufferedWriter.newLine();
        bufferedWriter.close();
        bufferedReader = new BufferedReader(new FileReader(path));
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
