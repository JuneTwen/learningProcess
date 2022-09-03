package com.learn.reflection.home02;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException {
        Class<?> aClass = Class.forName("java.io.File");
        Constructor<?>[] constructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class);
        Object o = constructor.newInstance("D:\\code\\Note\\myNew.txt");

        Method method = aClass.getDeclaredMethod("createNewFile");
        method.invoke(o);
    }
}
