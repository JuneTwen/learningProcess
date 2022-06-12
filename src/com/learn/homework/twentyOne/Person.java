package com.learn.homework.twentyOne;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passriver(){
        if(!(vehicles instanceof Boat)){
            vehicles = new Factory().getBoat();
        }
        vehicles.work();
    }
    public void common(){
        if(!(vehicles instanceof Horse)){
            vehicles = new Factory().getHorse();
        }
        vehicles.work();
    }
    public void passFire(){
        if(!(vehicles instanceof Plane)){
            vehicles = new Factory().getPlane();
        }
        vehicles.work();
    }
    public static void main(String[] args) {
        Person tang = new Person("tang",new Horse());
        tang.passriver();
        tang.common();
        tang.passriver();
        tang.common();
        tang.passFire();
    }
}
