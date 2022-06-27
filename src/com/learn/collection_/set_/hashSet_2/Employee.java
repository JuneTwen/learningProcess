package com.learn.collection_.set_.hashSet_2;

import java.util.Objects;

public class Employee {
    private String name;
    private double sal;
    private MyData birthday;

    public Employee(String name, double sal,
                    int year, int month, int day) {
        this.name = name;
        this.sal = sal;
        this.birthday = new MyData(year, month, day);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}
