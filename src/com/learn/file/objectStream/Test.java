package com.learn.file.objectStream;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "D:\\code\\Note\\data.dat";
        Dog dog = new Dog("cube",3);
        ObjectOutputStream OOPS = new ObjectOutputStream(new FileOutputStream(path));
        OOPS.writeObject(dog);
        ObjectInputStream OIPS = new ObjectInputStream(new FileInputStream(path));
        Dog in = (Dog ) OIPS.readObject();
        System.out.println(in.toString());
        OOPS.close();
        OIPS.close();
    }
}
