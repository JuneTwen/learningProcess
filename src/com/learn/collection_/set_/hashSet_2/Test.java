package com.learn.collection_.set_.hashSet_2;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("jack", 3000, 1111, 1, 1);
        Employee employee2 = new Employee("tom", 4000, 2000, 2, 2);
        Employee employee3 = new Employee("jack", 2000, 1111, 1, 1);
        HashSet hashSet = new HashSet();
        System.out.println(hashSet.add(employee1));
        System.out.println(hashSet.add(employee2));
        System.out.println(hashSet.add(employee3));
    }
}
