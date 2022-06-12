package com.learn.InnerClass;
/**
 * 匿名内部类
 */
public class AnonInner {
    public void ccc(){
        new  A() {
            @Override
            public void show() {
                System.out.println("test");
            }
        }.show();
    }

    public static void main(String[] args) {
        AnonInner anonInner = new AnonInner();
        anonInner.ccc();
    }
}
interface A {
    public void show();
}
