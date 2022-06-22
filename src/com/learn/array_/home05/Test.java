package com.learn.array_.home05;

public class Test {
    public static void split(String str){
        int up = 0;
        int low = 0;
        int num = 0;
        char[] chr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(chr[i])) up++;
            if (Character.isLowerCase(chr[i])) low++;
            if (Character.isDigit(chr[i])) num++;
        }
        System.out.println(up+"\t"+low+"\t"+num);
    }
    public static void main(String[] args) {
        split("123abcqWE");
    }
}
