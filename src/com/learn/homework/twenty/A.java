package com.learn.homework.twenty;

public class A {
    private String name;

    public A(String name) {
        this.name = name;
    }

    public void test(){
        class B{
            private String name = "777";
            public void show(){
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }

    public static void main(String[] args) {

        A a = new A("111");
        a.test();
    }
}
