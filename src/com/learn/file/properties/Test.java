package com.learn.file.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("1","---");
        properties.setProperty("2","----");
        properties.setProperty("3","-----");
        String path = "D:\\code\\Note\\newMysql.properties";
        properties.store(new FileWriter(path),"ccc");
    }
}
