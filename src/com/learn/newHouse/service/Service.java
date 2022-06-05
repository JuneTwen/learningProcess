package com.learn.newHouse.service;

import com.learn.newHouse.domain.House;

public class Service {
    private House[] houses;
    private int houseNums = 1;
    private int idCount = 1;

    public Service(int size) {
        houses = new House[size];
        houses[0] = new House(1,"jack",123,"zxc",800,"未出租");
    }
    public House[] list(){
        return houses;
    }
    public boolean addHouse(House house){
        if(houseNums == houses.length){
            System.out.println("Error!");
            return false;
        }
        houses[houseNums++] = house;
        house.setId(++idCount);
        return true;
    }
    public boolean deleteHouse(int delId){
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if(delId == houses[i].getId()){
                index = i;
            }
        }
        if (index == -1){
            return false;
        }
        for (int i = index; i < houseNums-1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNums] = null;
        return true;
    }
    public House modify(House house){
        return house;
    }
}
