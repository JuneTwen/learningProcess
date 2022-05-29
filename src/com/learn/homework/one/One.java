package com.learn.homework.one;

public class One {
    public void maxToMin(Person... people){
        for (int i = 0; i < people.length-1; i++) {
            for (int j = 0; j < people.length-1; j++) {
                Person temp = null;
                if(people[j+1].getAge() > people[j].getAge()){
                    temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
        for (Person peoples : people) {
            System.out.println(peoples.toString());
        }
    }
    public static void main(String[] args) {
        Person one = new Person("Jackey",18,"student");
        Person two = new Person("Smith",40,"actor");
        Person three = new Person("Calista",32,"teacher");
        Person four = new Person("Alista", 50, "staff");
        Person five = new Person("Joker", 12, "murder");

        One test = new One();
        test.maxToMin(one, two, three,four,five);
    }
}
