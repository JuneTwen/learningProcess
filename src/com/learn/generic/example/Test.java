package com.learn.generic.example;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("a",1111,1999,8,6));
        employees.add(new Employee("c",2222,1999,8,5));
        employees.add(new Employee("b",3333,1999,8,4));
        employees.add(new Employee("b",4444,1999,8,3));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0){
                    return i;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        System.out.println(employees);
    }
}
