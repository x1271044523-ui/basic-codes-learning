package com.xjh.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MyHashSetDemo {
    public static void main(String[] args) {
        Student stu1 = new Student("zhangsan",23);
        Student stu2 = new Student("lisi",24);
        Student stu3 = new Student("wangwu",25);
        Student stu4 = new Student("lisi",24);

        HashSet hashSet = new HashSet<>();
        hashSet.add(stu1);
        hashSet.add(stu2);
        hashSet.add(stu3);
        hashSet.add(stu4);

        //不重复
        System.out.println(hashSet.size());

        //无序
        for (Object o : hashSet) {
            System.out.println(o);
        }

        //linkedhashset有序
        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(stu1);
        linkedHashSet.add(stu2);
        linkedHashSet.add(stu3);
        linkedHashSet.add(stu4);
        System.out.println("===================================");
        for (Student student : linkedHashSet) {
            System.out.println(student);
        }
    }
}
