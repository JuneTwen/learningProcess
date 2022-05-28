package com.learn.test;

public class Test {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("jack",18,100);
        persons[2] = new Student("smith",19,90);
        persons[3] = new Teacher("jackey",38,3000);
        persons[4] = new Teacher("jackeyChen",60,10000);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
        }

    }
}
