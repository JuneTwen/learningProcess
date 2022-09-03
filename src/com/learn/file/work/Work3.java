package com.learn.file.work;

import java.io.*;
import java.util.Properties;

public class Work3 implements Serializable {
    private String name;
    private int age;
    private String color;

    public Work3(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Work3{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "D:\\code\\Note\\work.properties";
        Properties properties = new Properties();
        properties.setProperty("name", "tom");
        properties.setProperty("age", "5");
        properties.setProperty("color", "red");
        properties.store(new FileWriter(path),"test");
        Work3 work3 = new Work3(properties.getProperty("name"), Integer.parseInt(properties.getProperty("age")), properties.getProperty("color"));
        System.out.println(work3);
        ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("D:\\code\\Note\\work3.dat"));
        ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("D:\\code\\Note\\work3.dat"));
        OOS.writeObject(work3);
        Work3 newWork = (Work3) OIS.readObject();
        System.out.println(newWork);
        OIS.close();
        OOS.close();
    }
}
