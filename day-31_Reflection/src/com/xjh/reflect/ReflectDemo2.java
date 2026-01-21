package com.xjh.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Ballauma
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.xjh.reflect.Student");
        Constructor<?> con = clazz.getDeclaredConstructor(String.class, int.class);

        con.setAccessible(true);

        Student stu = (Student) con.newInstance("张三", 23);
        System.out.println(stu);

    }
}
