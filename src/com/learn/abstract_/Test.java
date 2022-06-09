package com.learn.abstract_;

public class Test {
    public static void main(String[] args) {
        Manager jacky = new Manager("Jacky", 123, 3000, 1200);
        CommonEmployee calista = new CommonEmployee("Calista", 123, 3000);
        jacky.work();
        calista.work();
    }
}
