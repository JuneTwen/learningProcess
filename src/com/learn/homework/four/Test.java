package com.learn.homework.four;

public class Test {
    public static void main(String[] args) {

        GeneralStaff jack = new GeneralStaff("jack", 600, 22);
        BranchManager smith = new BranchManager("Smith", 800, 22);
        jack.showSalary();
        smith.showSalary();
    }
}
