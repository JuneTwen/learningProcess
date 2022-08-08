package com.learn.file.buffered;

import java.io.*;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        String path = "D:\\code\\Note\\testFile.txt";
        String newPath = "D:\\code\\Note\\newFile.txt";

        int temp = 0;
        byte[] buff = new byte[1024];

        BufferedInputStream input = new BufferedInputStream(new FileInputStream(path));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(newPath));

        while((temp = input.read(buff)) != -1) {
            output.write(buff, 0, temp);
        }
        input.close();
        output.close();
    }
}
