package com.learn.newHouse.view;

import com.learn.newHouse.domain.House;
import com.learn.newHouse.service.Service;
import com.learn.newHouse.utils.Utility;

public class View {
    private boolean loop = true;
    private char key = ' ';
    private Service service = new Service(10);

    public void houseList(){
        System.out.println("--------------房 屋 列 表---------------");
        System.out.println("编号"+"\t"+"房主"+"\t"+"电话"+"\t"+"地址"+"\t"+"月租状态（未出租/已出租）");
        House[] houses = service.list();
        for (House one : houses) {
            if (one != null) {
                System.out.println(one.toString());
            }
        }
    }
    public void add(){
        System.out.println("添加房屋");
        System.out.print("姓名");
        String name = Utility.readString(8);
        System.out.print("电话");
        int phone = Utility.readInt();
        System.out.print("地址");
        String address = Utility.readString(16);
        System.out.print("月租");
        int monthly = Utility.readInt();
        System.out.print("状态");
        String state = Utility.readString(8);
        House newHouse = new House(0, name, phone, address, monthly, state);
        if(service.addHouse(newHouse)){
            System.out.println("Done");
        }else {
            System.out.println("Fail");
        }
    }
    public void delHouse(){
        System.out.print("请选择待删除房屋编号(-1退出):");
        int index = Utility.readInt();
        if (index == -1){
            return;
        }
        if(Utility.readConfirmSelection() == 'Y'){
            service.deleteHouse(index);
        }
    }
    public void mainMenu() {
        do {
            System.out.println("--------------------房屋出租系统--------------------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退       出");
            System.out.print("请选择（1-6）：");
            key = Utility.readChar();
            switch (key){
                case '1' -> {
                    System.out.println("新 增");
                    add();
                }
                case '2' -> System.out.println("查 找");
                case '3' -> {
                    System.out.println("删 除");
                    delHouse();
                }
                case '4' -> System.out.println("修 改");
                case '5' -> {
                    System.out.println("列 表");
                    houseList();
                }
                case '6' -> {
                    System.out.println("Exit!");
                    loop = false;
                }
            }
        }while(loop);
    }
}
