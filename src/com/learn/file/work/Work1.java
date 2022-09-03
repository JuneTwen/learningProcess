package com.learn.file.work;

import java.io.File;
import java.io.IOException;

public class Work1 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\code\\Note\\mytemp";
        File file = new File(path);
        file.mkdir();
        file.createNewFile();
        File newFile = new File(file, "hello.txt");
        if (!newFile.exists()){
            newFile.createNewFile();
            System.out.println("done");
        }else {
            System.out.println("exists");
        }
    }
}
