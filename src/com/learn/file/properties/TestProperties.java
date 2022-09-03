package com.learn.file.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) throws IOException {
        Properties set = new Properties();
        String path = "D:\\code\\Note\\mysql.properties";
        set.load(new FileReader("D:\\code\\Note\\mysql.properties"));
        set.list(System.out);
        set.setProperty("name","zhanghao");
        set.list(System.out);
        set.store(new FileWriter(path), "test");


    }
}
