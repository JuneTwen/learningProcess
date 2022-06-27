package com.learn.collection_.set_.hashSet_;

import java.util.HashSet;

@SuppressWarnings({"all"})
public class Test {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        System.out.println(set.add("jack"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("smith"));
        System.out.println(set.add("smith"));
    }
}
