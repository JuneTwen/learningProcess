package com.learn.file.buffered;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        String path = "D:\\code\\Note\\testFile.txt";
        String newPath = "D:\\code\\Note\\newFile.txt";
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newPath));
        while((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
