package com.learn.houseRent;

import java.util.Scanner;

public class HouseRentSystem {
    private Scanner input = new Scanner(System.in);
    HousesData[] houses = new HousesData[100];
    private int houseNum = 0;

    public void mainMenu(){
        System.out.println("--------------------房屋出租系统--------------------");
        System.out.println("1 新 增 房 源");
        System.out.println("2 查 找 房 屋");
        System.out.println("3 删 除 房 屋");
        System.out.println("4 修 改 房 屋 信 息");
        System.out.println("5 房 屋 列 表");
        System.out.println("6 退       出");
        System.out.print("请选择（1-6）：");
    }
    public void addHouse(){
        System.out.println("----------------------添加房屋----------------------");
        houses[houseNum] = new HousesData();
        houses[houseNum].setNumber(houseNum+1);

        System.out.print("姓名：");
        houses[houseNum].setName(input.next());

        System.out.print("电话：");
        houses[houseNum].setPhone(input.nextInt());

        System.out.print("地址：");
        houses[houseNum].setAddress(input.next());;

        System.out.print("月租：");
        houses[houseNum].setMonthly(input.nextDouble());;

        System.out.print("状态（未出租/已出租）：");
        houses[houseNum].setState(input.next());;

        houseNum++;
        System.out.println("----------------------添加完成----------------------");
    }

    public void checkHouse(){
        int choose;
        System.out.println("----------------------查找房屋----------------------");
        System.out.print("请输入你要查找的id：");
        choose = input.nextInt();
        for (int i = 0; i < houseNum; i++) {
            if(houses[i] != null){
                if(choose == houses[i].getNumber()){
                    System.out.println(houses[i].toString());
                    break;
                }
            }
            if(i == houseNum-1){
                System.out.println("----------------------没有该房屋----------------------");
            }
        }
    }
    public void deleteHouse(){
        int choose;
        String confirm;
        System.out.println("----------------------删除房屋----------------------");
        System.out.print("请选择待删除房屋编号（-1退出）：");
        choose = input.nextInt();
        if(choose != -1){
            System.out.print("确认是否删除（Y/N）：请小心选择：\n请输入你的选择（Y/N）");
            confirm = input.next();
            if(confirm.equals("Y")){
                houses[choose-1] = null;
                System.out.println("----------------------删除完成----------------------");
            }
        }
    }
    public void modifyHouse(){
        int choose;
        System.out.println("----------------------修改客户----------------------");
        System.out.print("请选择待修改房屋编号（-1）退出：");
        choose = input.nextInt()-1;

        System.out.print("姓名："+"("+houses[choose].getName()+")");
        houses[choose].setName(input.next());

        System.out.print("电话："+"("+houses[choose].getPhone()+")");
        houses[choose].setPhone(input.nextInt());

        System.out.print("地址："+"("+houses[choose].getAddress()+")");
        houses[choose].setAddress(input.next());

        System.out.print("月租："+"("+houses[choose].getMonthly()+")");
        houses[choose].setMonthly(input.nextDouble());

        System.out.print("状态（未出租/已出租）："+"("+houses[choose].getState()+")");
        houses[choose].setState(input.next());

        System.out.println("----------------------修改完成----------------------");
    }
    public void houseList(){
        System.out.println("----------------------房屋列表----------------------");
        System.out.println("编号"+"\t"+"房主"+"\t"+"电话"+"\t"+"地址"+"\t"+"月租状态（未出租/已出租）");
        for (int i = 0; i < houseNum; i++) {
            if(houses[i] != null){
                System.out.println(houses[i].toString());
            }
        }
        System.out.println("----------------------房屋列表完成----------------------");
    }
}
