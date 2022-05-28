package com.learn.wechat_pay;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        int loopNums = 0;
        String chioce = "";
        int balance = 0;
        String[] details = new String[10];
        int earnings = 0;
        int consume = 0;
        String consumeDetail = "";
        Scanner in = new Scanner(System.in);

        while(loop){
            System.out.println("-------------Menu-------------");
            System.out.println("-------------1 Detail-----------");
            System.out.println("-------------2 Earnings-----------");
            System.out.println("-------------3 Consume-----------");
            System.out.println("-------------4 Exit-----------");
            System.out.print("Please input your choice: ");
            chioce = in.next();
            switch (chioce){
                case "1":
                    System.out.println("-------------Detail-----------");
                    for (int i = 0; i < loopNums; i++) {
                        System.out.println(details[i]);
                    }
                    break;
                case "2":
                    System.out.println("-------------Earnings-----------");
                    System.out.print("Enter your earnings: ");
                    earnings = in.nextInt();
                    balance += earnings;
                    System.out.println("Done! Your current balance is: "+balance);
                    Date now = new Date();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String createTime = dateFormat.format(now);
                    details[loopNums++] = "Earning"+"\t+"+earnings+"\t"+createTime+"\t"+balance;
                    break;
                case "3":
                    System.out.println("-------------Consume-----------");
                    System.out.print("Enter your spending details: ");
                    consumeDetail = in.next();
                    System.out.print("Enter the amount you spend: ");
                    consume = in.nextInt();
                    balance -= consume;
                    System.out.println("Done! Your current balance is: "+balance);
                    Date now3 = new Date();
                    SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String createTime3 = dateFormat3.format(now3);
                    details[loopNums++] = consumeDetail+"\t-"+consume+"\t"+createTime3+"\t"+balance;
                    break;
                case "4":
                    System.out.println("-------------Exit-----------");
                    loop = false;
                    break;
                default:
                    System.out.println("error!");
            }
        }
    }
}
