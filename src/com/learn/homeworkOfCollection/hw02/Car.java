package com.learn.homeworkOfCollection.hw02;

import java.util.ArrayList;
import java.util.Iterator;

public class Car {
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", 400000);
        Car car2 = new Car("Bentley", 5000000);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car2);
        System.out.println(cars);
        // cars.remove(car);
        System.out.println(cars);
        System.out.println(cars.contains(car));
        System.out.println(cars.size());
        System.out.println(cars.isEmpty());
        // cars.clear();
        System.out.println(cars.isEmpty());
        ArrayList<Car> arrayList = new ArrayList<>();
        arrayList.addAll(cars);
        System.out.println(arrayList);
        System.out.println(arrayList.containsAll(cars));
        // System.out.println(arrayList.removeAll(cars));
        System.out.println(arrayList);
        for (Car car1 : cars) {
            System.out.println(car1);
        }
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car next = iterator.next();
            System.out.println(next);
        }
    }
}
