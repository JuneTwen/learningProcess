package com.learn.collection_.set_.hashSet_1;

import java.util.HashSet;
import java.util.Objects;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

//    public boolean equals(Employee epy) {
//        if (this == epy) {
//            return true;
//        }
//        if (this.name.equals(epy.name) && this.age == epy.age){
//            return true;
//        }
//        return false;
//    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("jack", 12);
        Employee employee2 = new Employee("tom", 13);
        Employee employee3 = new Employee("jack", 12);
        HashSet hashSet = new HashSet();
        System.out.println(hashSet.add(employee1));
        System.out.println(hashSet.add(employee2));
        System.out.println(hashSet.add(employee3));
    }
}
