package com.learn.homework.ten;

public class Test {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("jack",18,"Teacher","Professor",9000);
        Doctor d2 = new Doctor("jack",20,"Teacher","Professor",9000);
        System.out.println(d1.equals(d2));
    }
}
