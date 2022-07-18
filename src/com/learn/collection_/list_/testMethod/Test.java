package com.learn.collection_.list_.testMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
//        Collections.reverse(arrayList);
//        System.out.println(arrayList);
//        Collections.shuffle(arrayList);
//        System.out.println(arrayList);
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
//        System.out.println(Collections.max(arrayList));
//        System.out.println(Collections.max(arrayList, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        }));
        arrayList.add(2);
        System.out.println(Collections.frequency(arrayList, 1));
    }
}
