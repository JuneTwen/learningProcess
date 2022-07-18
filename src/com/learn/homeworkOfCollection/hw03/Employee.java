package com.learn.homeworkOfCollection.hw03;

import java.util.HashMap;
import java.util.Set;

public class Employee {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);
        Set<String> set = hashMap.keySet();
        for (Object s : set) {
            System.out.println(s+"-"+hashMap.get(s));
        }

        hashMap.put("jack",2600);
        for (String s : set) {
            hashMap.put(s, hashMap.get(s) + 100);
        }
        System.out.println(hashMap);

    }
}
