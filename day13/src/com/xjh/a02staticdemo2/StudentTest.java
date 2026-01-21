package com.xjh.a02staticdemo2;

import com.xjh.a01staticdemo1.ArrUtil;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("zhangsan",23,"男");
        Student stu2 = new Student("lisi",24,"男");
        Student stu3 = new Student("wangwu",25,"男");

        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
