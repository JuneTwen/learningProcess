package com.learn.houseRent;

import java.util.Scanner;

public class Test {
    public void test(boolean loop) {
        HouseRentSystem hrs = new HouseRentSystem();
        Scanner in = new Scanner(System.in);
        int choice;
        while (loop) {
            hrs.mainMenu();
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    hrs.addHouse();
                    break;
                case 2:
                    hrs.checkHouse();
                    break;
                case 3:
                    hrs.deleteHouse();
                    break;
                case 4:
                    hrs.modifyHouse();
                    break;
                case 5:
                    hrs.houseList();
                    break;
                case 6:
                    loop = false;
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("error!");
            }
        }
    }
    public static void main(String[] args) {

        Test one = new Test();
        one.test(true);

    }
}
