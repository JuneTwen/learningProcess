package com.learn.file.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        String path = "D:\\code\\Note\\testFile.txt";
        String newPath = "D:\\code\\Note\\newFile.txt";
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream(path);
            output = new FileOutputStream(newPath);
            int len = 0;
            byte[] b = new byte[1024];
            while ((len = input.read(b)) != -1) {
                output.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
