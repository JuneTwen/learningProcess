package com.learn.file.fileWrite;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNote {
    public static void main(String[] args) {
        String path = "D:\\code\\Note\\testFile.txt";
        String str = "风雨之后，定见彩虹";
        FileWriter writer = null;
        try {
            writer = new FileWriter(path);
            writer.write(str, 0, 4);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
