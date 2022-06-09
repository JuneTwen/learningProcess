package com.learn.static_;

public class Test3 {
    private Test3() {
    }
    private static Test3 one;
    private static Test3 getOne(){
        if(one == null){
            one = new Test3();
        }
        return one;
    }

    public static void main(String[] args) {
        Test3 two = Test3.getOne();
    }
}
