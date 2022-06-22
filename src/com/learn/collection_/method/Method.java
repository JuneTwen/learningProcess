package com.learn.collection_.method;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Method {
    private String name;
    private String dec;
    private int price;

    public Method(String name, String dec, int price) {
        this.name = name;
        this.dec = dec;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Method{" +
                "name='" + name + '\'' +
                ", dec='" + dec + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Collection col = new ArrayList();
        Method one = new Method("one", "111", 10);
        Method two = new Method("two", "222", 100);
        Method three = new Method("three", "333", 1000);
        col.add(one);
        col.add(two);
        col.add(three);
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        
    }
}
