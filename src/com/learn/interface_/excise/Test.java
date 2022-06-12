package com.learn.interface_.excise;

public class Test {
    public static void main(String[] args) {
     new C().pX();
    }
}
interface A {
    int x = 0;
}
class B {
    int x = 1;
}
class C extends B implements A {
    public void pX(){
        System.out.println(super.x);
    }
}