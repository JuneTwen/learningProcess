package com.learn.generic.custom;

import java.util.ArrayList;

public class Apple<T, R, M> {
    public <E> void fly(E e) {
        System.out.println(e.getClass().getSimpleName());
    }
    public void eat(T t) {}
    public void run(M m) {}

    public static void main(String[] args) {
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10);
        apple.fly(new Dog());
        ArrayList<?> arrayList = new ArrayList<>();
    }
}
class Dog {
}
