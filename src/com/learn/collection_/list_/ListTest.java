package com.learn.collection_.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List lst = new ArrayList();
        for (int i = 0; i < 10; i++) {
            lst.add(""+i);
        }
        lst.add(2,"hspedu");
        System.out.println(lst.get(5));
        lst.remove(6);
        lst.set(7,"setTest");
        Iterator iterator = lst.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
