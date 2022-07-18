package com.learn.generic.one;

import java.util.ArrayList;

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
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("--",11));
        dogs.add(new Dog("---",12));
        dogs.add(new Dog("----",13));
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

    }
}
