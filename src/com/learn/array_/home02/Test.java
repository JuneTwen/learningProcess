package com.learn.array_.home02;

public class Test {
//    public static String reverse(String str,int start,int end){
//        StringBuilder sb = new StringBuilder(str);
//        StringBuilder temp = new StringBuilder(str.substring(start,end));
//        StringBuilder pmet = new StringBuilder();
//        int len = temp.length();
//        for (int i = 0; i < len; i++) {
//            pmet.append(temp.charAt(len-i-1));
//        }
//        sb.replace(start,end,pmet.toString());
//        return sb.toString();
//    }
    public static String reverse(String str,int start,int end){
        if(!(str != null && start >= 0  && start < end && end < str.length())){
            throw new RuntimeException("ERROR!");
        }
        char[] chr = str.toCharArray();
        for (int i = start,j = end-1; i < j; i++,j--) {
            char temp = chr[i];
            chr[i] = chr[j];
            chr[j] = temp;
        }
        String newStr = new String(chr);
        return newStr;
    }
    public static void main(String[] args) {
        String str = "abcdef";
        try {
            System.out.println(Test.reverse(str,0,7));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
