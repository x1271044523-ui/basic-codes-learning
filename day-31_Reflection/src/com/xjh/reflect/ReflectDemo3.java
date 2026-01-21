package com.xjh.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Ballauma
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName("com.xjh.reflect.Student");
        Constructor<?> con = clazz.getDeclaredConstructor(String.class, int.class);
        con.setAccessible(true);
        Student stu = (Student) con.newInstance("张三", 23);

        Field namefield = clazz.getDeclaredField("name");
        namefield.setAccessible(true);
        namefield.set(stu,"lisi");

        System.out.println(stu);



    }
}
