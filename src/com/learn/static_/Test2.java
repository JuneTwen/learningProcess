package com.learn.static_;

public class Test2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
    }
}
class Animal {
    private static int n1 = setN1();

    public Animal() {
        System.out.println("Animal's construct");
    }

    static {
        System.out.println("Animal's static code block");
    }

    public static int setN1(){
        return 1;
    }

    {
        System.out.println("Animal's code block");
    }
}
class Cat extends Animal{
    private static int n2 = setN2();
    public Cat() {
        System.out.println("Cat's construct");
    }
    static {
        System.out.println("Cat's static code block");
    }
    public static int setN2() {
        return 2;
    }
    {
        System.out.println("Cat's code block");
    }
}
