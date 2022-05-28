package com.learn.object_;

public class ToString_ {
    public static void main(String[] args) {
        Monster Calista = new Monster("calista", "adcarry", 1000);
        System.out.println(Calista.toString());
    }
}
class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
