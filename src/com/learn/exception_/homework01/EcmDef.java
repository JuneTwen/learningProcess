package com.learn.exception_.homework01;

import java.util.Scanner;

public class EcmDef {
    public static void cal(){
        int n1;
        int n2;
        int n;
        while (true) {
            Scanner in = new Scanner(System.in);
            try{
                n1 = in.nextInt();
                n2 = in.nextInt();
                n = n1 / n2;
                break;
            }catch (ArithmeticException e){
                System.out.println("除数不能为0！");
            }catch (NumberFormatException e){
                System.out.println("数据格式不正确!");
            }catch (Exception e){
                System.out.println("Error!");
            }
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        EcmDef.cal();
        int n = 10;
        Integer i = n;
        String str = i + "";
        String str2 = i.toString();
        String str3 = String.valueOf(i);
        Integer.parseInt(str);

    }
}
