package com.learn.enum_;

public class TestWeek {
    public static void main(String[] args) {
        Week[] week = Week.values();
        for (Week one : week){
            System.out.println(one.toString());
            one.show();
        }
    }
}
