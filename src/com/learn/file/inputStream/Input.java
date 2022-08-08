package com.learn.file.inputStream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {
    public void test1() {
        String path = "D:\\code\\Note\\testFile.txt";
        int data = 0;
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(path);
            while ((data = stream.read()) != -1) {
                System.out.print((char )data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println();
    }
    @Test
    public void test2(){
        String path = "D:\\code\\Note\\testFile.txt";
        FileInputStream streamOne = null;
        byte[] b = new byte[8];
        int temp = 0;
        try {
            streamOne = new FileInputStream(path);
            while ((temp = streamOne.read(b)) != -1) {
                System.out.print(new String(b,0,temp));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                streamOne.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {

    }
}
