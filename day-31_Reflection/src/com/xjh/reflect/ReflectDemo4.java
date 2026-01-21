package com.xjh.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Ballauma
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(23);

        Class<?> clazz = Class.forName("com.xjh.reflect.Student");

        Method m = clazz.getDeclaredMethod("eat", String.class);

        m.setAccessible(true);
        m.invoke(s,"饭");
    }
}
