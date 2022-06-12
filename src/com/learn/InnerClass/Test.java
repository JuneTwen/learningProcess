package com.learn.InnerClass;

public class Test {
    private int outNum;

    public Test(int outNum) {
        this.outNum = outNum;
    }

    public int getOutNum(){
        return outNum;
    }

    public void test(){
        final class Inner{
            private int outNum = 100;
            public void show(){
                System.out.println(outNum);
                System.out.println(Test.this.outNum);
            }
        }
        Inner inner = new Inner();
        inner.show();
    }
    public static void main(String[] args) {
        Test test = new Test(90);
        test.test();
    }
}
