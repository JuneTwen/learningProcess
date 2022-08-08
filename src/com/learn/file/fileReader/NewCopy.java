package com.learn.file.fileReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NewCopy {
    public static void main(String[] args) {
        String path = "D:\\code\\Note\\testFile.txt";
        String newPath = "D:\\code\\Note\\newFile.txt";
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader(path);
            writer = new FileWriter(newPath);
            int len = 0;
            char[] chr = new char[5];
            while ((len = reader.read()) != -1) {
                writer.write(chr, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
