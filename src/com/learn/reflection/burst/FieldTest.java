package com.learn.reflection.burst;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FieldTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<Test> aClass = Test.class;

        Constructor<Test> constructor = aClass.getConstructor();
        Test jack = constructor.newInstance();

        Method setName = aClass.getMethod("setName", String.class);
        setName.invoke(jack, "Tom");

        Field field = aClass.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println(field.get(jack));


    }
}
