package com.learn.generic.three;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student jack = new Student("Jack");
        Student calista = new Student("Calista");
        Student tom = new Student("Tom");

        HashMap<String, Student> hashMap = new HashMap<>();
        hashMap.put(jack.getName(), jack);
        hashMap.put(calista.getName(), calista);
        hashMap.put(tom.getName(), tom);

        Set<String> keySet = hashMap.keySet();
        for (Object key : keySet) {
            System.out.println(key+ "-" +hashMap.get(key));
        }

        Collection<Student> values = hashMap.values();
        for (Student value : values) {
            System.out.println(value + "-" +value.getName());
        }


        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();



    }
}
