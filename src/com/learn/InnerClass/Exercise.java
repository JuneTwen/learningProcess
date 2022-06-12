package com.learn.InnerClass;

public class Exercise{
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("----");
            }
        });
    }
}
interface Bell{
    public void ring();
}
class CellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}
