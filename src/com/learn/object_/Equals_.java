package com.learn.object_;

public class Equals_ {

    public static void main(String[] args) {

        Person person1 = new Person("jack", 11, 'a');
        Person person2 = new Person("jack", 11, 'a');
        System.out.println(person1.equals(person2));

    }
}
