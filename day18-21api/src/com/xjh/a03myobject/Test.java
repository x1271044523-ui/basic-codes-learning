package com.xjh.a03myobject;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {

        Student stu1 = new Student();
        Student stu2 = new Student();

        //重写了equals方法，判断的是内容而不是地址值
        System.out.println(stu1.equals(stu2));//true
        //重写了tostring方法，直接打印内容
        System.out.println(stu1);

        //objects里的equals方法在对象为空时可以使用
        boolean result = Objects.equals(stu1, stu2);
        System.out.println(result);

    }
}
