package com.learn.array_.home03;

import java.util.Scanner;

public class Test {
    private String name;
    private String code;
    private String email;
    private static final Scanner in = new Scanner(System.in);

    public void setName(){
        System.out.println("setName");
        String name = in.next();
        int len = name.length();
        if (!(len == 2 || len == 3 || len ==4)){
            throw new RuntimeException("用户名长度为2或3或4");
        }
        this.name = name;
    }
    public void setCode(){
        System.out.println("setCode");
        String code = in.next();
        int len = code.length();
        char[] chr = code.toCharArray();
        if (!(len == 6)){
            throw new RuntimeException("密码长度为6");
        }
        for (int i = 0; i < len; i++) {
            if (!(Character.isDigit(chr[i]))){
                throw new RuntimeException("密码要求全是数字");
            }
        }
        this.code = code;
    }
    public void setEmail(){
        System.out.println("setEmail");
        String email = in.next();
        if (!(email.indexOf("@") < email.indexOf(".") && email.indexOf("@") > 0)){
            throw new RuntimeException("ERROR!");
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Test test = new Test();
        while (true) {
            try {
//                test.setName();
//                test.setCode();
                test.setEmail();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(test.toString());
    }
}
