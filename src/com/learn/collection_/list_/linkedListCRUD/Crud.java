package com.learn.collection_.list_.linkedListCRUD;

import java.util.LinkedList;
@SuppressWarnings({"all"})
public class Crud {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove(0);
        System.out.println(linkedList);
    }
}
