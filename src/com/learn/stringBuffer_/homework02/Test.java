package com.learn.stringBuffer_.homework02;

public class Test {
    public static String gap(double price){
        String str = Double.toString(price);
        StringBuffer stringBuffer = new StringBuffer(str);
        int dotNum = stringBuffer.indexOf(".");
        do {
            stringBuffer.insert(dotNum-3, ",");
            dotNum -= 3;
        }while(dotNum > 3);
            return stringBuffer.toString();
    }
    public static void randomTest(){
        System.out.println((int)(2 + Math.random() * 6));
    }
    public static void main(String[] args) {
        String name = "Phone";
        double price = 1234.59;
        System.out.println(Test.gap(price));
        Test.randomTest();
    }
}
