package com.learn.homework.twentyOne;

public class Factory {
    private static final Horse horse = new Horse();
    public Horse getHorse(){
        return horse;
    }
    public Boat getBoat(){
        return new Boat();
    }
    public Plane getPlane(){
        return new Plane();
    }
}
