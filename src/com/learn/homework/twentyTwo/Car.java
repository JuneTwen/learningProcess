package com.learn.homework.twentyTwo;

public class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if(temperature > 40){
                System.out.println("Cold");
            }else if(temperature < 0){
                System.out.println("Hot");
            }else {
                System.out.println("Shutdown");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }

    public static void main(String[] args) {
        Car car1 = new Car(-1);
        Car car2 = new Car(50);
        Car car3 = new Car(27);
        Car car4 = new Car(111);
        car1.getAir().flow();
        car2.getAir().flow();
        car3.getAir().flow();
        car4.getAir().flow();
    }
}
