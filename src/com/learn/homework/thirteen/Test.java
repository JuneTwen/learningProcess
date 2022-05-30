package com.learn.homework.thirteen;

public class Test {
    public void sort(Person[] people){
        Person temp = null;
        for (int i = 0; i < people.length-1; i++) {
            for (int j = 0; j < people.length-1; j++) {
                if(people[j].getAge() < people[j+1].getAge()){
                    temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
    }
    public void sbTeach(Person person){
        if(person instanceof Student){
            ((Student)person).study();
        }else if(person instanceof Teacher){
            ((Teacher)person).teach();
        }else {
            System.out.println("error");
        }
    }
    public static void main(String[] args) {

        Test test = new Test();
        Person[] people = new Person[4];
        people[0] = new Student("Jacky","boy",20,2017011281);
        people[1] = new Student("Smith","boy",23,2017011280);
        people[2] = new Teacher("John","boy",40,10);
        people[3] = new Teacher("Lee","boy",50,20);
        test.sort(people);
        for (Person one:people) {
            System.out.println(one.getName());
        }
        Teacher t1 = new Teacher("Lee","boy",50,20);
        Student s1 = new Student("Smith","boy",23,2017011280);
        test.sbTeach(t1);
        test.sbTeach(s1);
    }
}
