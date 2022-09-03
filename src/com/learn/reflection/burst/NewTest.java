package com.learn.reflection.burst;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Test> aClass = Test.class;

        Test test = aClass.newInstance();
        System.out.println(test);

        Constructor<Test> constructor = aClass.getConstructor(String.class);
        Test jack = constructor.newInstance("jack");
        System.out.println(jack);

        Constructor<Test> constructor1 = aClass.getDeclaredConstructor(String.class, int.class);
        constructor1.setAccessible(true);
        Test calista = constructor1.newInstance("calista", 11);
        System.out.println(calista);
    }
}
