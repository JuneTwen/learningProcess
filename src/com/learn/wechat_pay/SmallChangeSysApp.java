package com.learn.wechat_pay;

import java.util.Scanner;

public class SmallChangeSysApp {
    SmallChangeSysOOP scs = new SmallChangeSysOOP();
    public void start(boolean loop){
        while(loop) {
            Scanner in = new Scanner(System.in);
            scs.menu();
            int choose = in.nextInt();
            switch (choose) {
                case 1 -> scs.showDetails();
                case 2 -> scs.earning();
                case 3 -> scs.consume();
                case 4 -> {
                    System.out.println("Exit!");
                    loop = false;
                }
                default -> System.out.println("Error!");
            }
        }
    }
    public static void main(String[] args) {
        SmallChangeSysApp scsa = new SmallChangeSysApp();
        scsa.start(true);
    }
}
