package com.learn.exception_;

import java.util.Scanner;

public class Input {
    public static int input(){
        Scanner in = new Scanner(System.in);
        int num = 0;
        while (true) {
            try {
                String str = in.next();
                num = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数：");
            }
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(Input.input());

    }
}
