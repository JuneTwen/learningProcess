package com.learn.collection_.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("list",10);
        Dog dog2 = new Dog("set",100);
        Dog dog3 = new Dog("map",1000);
        Collection col = new ArrayList();
        col.add(dog1);
        col.add(dog2);
        col.add(dog3);
        // iterator
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //for
        for (Object o : col) {
            System.out.println(o);

        }

    }
}
