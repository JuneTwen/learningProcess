package com.learn.reflection.entry;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        String path = "src\\com\\learn\\reflection\\entry\\set.properties";
        Properties properties = new Properties();
        properties.load(new FileInputStream(path));
        String cls = properties.getProperty("classname");
        String method = properties.getProperty("method");

        Class catClass = Class.forName(cls);// 加载类
        Object o = catClass.newInstance();// 获取实例对象
        Method method1 = catClass.getMethod(method);// 加载了类中的方法对象
        method1.invoke(o);
        Field field = catClass.getField("age");
        System.out.println(field.get(o));

        Constructor constructor = catClass.getConstructor();// 无参构造器
        Constructor c = catClass.getConstructor(String.class);// 有参构造器

    }
}
