package com.learn.reflection.home;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> aClass = Class.forName("com.learn.reflection.home.PrivateTest");
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();

        Field field = aClass.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println(field.get(o));
        field.set(o, "Test Name");

        Method method = aClass.getDeclaredMethod("getName");
        System.out.println(method.invoke(o));
    }
}
