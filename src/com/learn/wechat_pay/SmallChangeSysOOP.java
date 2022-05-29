package com.learn.wechat_pay;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    private double balance = 0;
    private ArrayList<String> details = new ArrayList<String>();
    private Scanner in = new Scanner(System.in);

    public String getTime(){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String createTime = dateFormat.format(now);
        return createTime;
    }
    public void menu(){
        System.out.println("-------------Menu-----------------");
        System.out.println("-------------1 Detail-------------");
        System.out.println("-------------2 Earnings-----------");
        System.out.println("-------------3 Consume------------");
        System.out.println("-------------4 Exit---------------");
        System.out.print("Please input your choice: ");
    }
    public void showDetails(){
        for (String detail : details) {
            System.out.println(detail);
        }
    }
    public void earning(){
        double earn = 0;
        System.out.print("Enter your earnings: ");
        earn =  in.nextDouble();
        this.balance += earn;
        details.add("Earning"+"\t+"+earn+"\t"+this.getTime()+"\t"+balance);
    }
    public void consume(){
        double spend = 0;
        String consumeDetailes = "";
        System.out.print("Enter the amount you spend: ");
        spend = in.nextDouble();
        System.out.print("Enter your spending details: ");
        consumeDetailes = in.next();
        this.balance -= spend;
        details.add(consumeDetailes+"\t-"+spend+"\t"+this.getTime()+"\t"+balance);
    }
}
