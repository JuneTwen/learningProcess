package com.learn.map_.mapExercise;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        HashMap<String, Employee> hashMap = new HashMap<>();
        hashMap.put("111",new Employee("Jacky",3000,111));
        hashMap.put("222",new Employee("Tom",66000,222));
        hashMap.put("333",new Employee("John",19000,333));

        Collection<Employee> values = hashMap.values();
        for (Employee value : values) {
            if (value.getSalary() > 18000){
                System.out.println(value);
            }
        }
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);}
        });
    }
}
