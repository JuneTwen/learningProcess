package com.learn.array_.home04;

public class Test {
    public static void trans(String str){
        if (!(str.indexOf(" ") < str.lastIndexOf(" "))){
            throw new RuntimeException("需要两个空格");
        }else if (!(str.indexOf(" ") > 0)){
            throw new RuntimeException("不能以空格开头！");
        }
        String newStr[] = str.split(" ");
        int fstSpace = str.indexOf(" "); //get 2 space
        int sndSpace = str.lastIndexOf(" ");
        String one = str.substring(0,fstSpace);//截取三个单词
        String two = str.substring(fstSpace+1,sndSpace);
        String three = str.substring(sndSpace+1);
        System.out.println(three+","+one+"."+two.charAt(0));
    }
    public static void main(String[] args) {
        try {
            Test.trans("William Jefferson Clinton");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
