package com.learn.generic.two;

public class TestGeneric<E> {
    E s;

    public TestGeneric(E s) {
        this.s = s;
    }

    public static void main(String[] args) {
        TestGeneric<String> generic = new TestGeneric<String>("--");
        TestGeneric<Integer> ss = new TestGeneric<Integer>(9);
    }
}
