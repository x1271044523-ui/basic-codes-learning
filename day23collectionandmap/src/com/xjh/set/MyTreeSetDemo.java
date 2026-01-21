package com.xjh.set;

import java.util.TreeSet;

public class MyTreeSetDemo {
    public static void main(String[] args) {

        Student stu1 = new Student("zhangsan",23);
        Student stu2 = new Student("lisi",25);
        Student stu3 = new Student("wangwu",27);
        Student stu4 = new Student("zhaoliu",22);

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(stu1);
        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu2);
        ts.add(stu3);
        ts.add(stu3);
        ts.add(stu4);
        ts.add(stu4);

        //在student类实现了comparable接口实现了里面的方法后，treeset才能存入自定义类
        //这是因为treeset会自动排序，不写明自定义类排序规则所以无法存入

//        HashSet 去重：靠的是 hashCode() 和 equals()。
//        TreeSet 去重：跟 equals 没有任何关系！ 它靠的是 compareTo 的返回值。
        for (Student t : ts) {
            System.out.println(t);
        }
    }
}
