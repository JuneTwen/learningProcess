package com.learn.file.input;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class Create {
    public void testFile(){
        String path = "D:\\code\\Note\\testFile.txt";
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String path1 = "D:\\code\\Note\\";
        File parentFile = new File(path1);
        String filename = "test2.txt";
        File file1 = new File(parentFile, filename);
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void info(){
        File file = new File("D:\\code\\Note\\testFile.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());// 按字节算
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

    }

    public static void main(String[] args) {
        String path = "D:\\code\\Note\\";
        File file = new File(path,"\\testDir\\a");
        file.mkdirs();
    }

}
