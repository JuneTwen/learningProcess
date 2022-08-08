package com.learn.file.design;

public class Design {
    public static void main(String[] args) {
        NewBufferedReader reader = new NewBufferedReader(new NewFileReader());
        reader.read();
    }
}
