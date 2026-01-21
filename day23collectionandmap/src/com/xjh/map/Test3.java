package com.xjh.map;

import java.util.Comparator;
import java.util.TreeMap;

public class Test3 {
    public static void main(String[] args) {
        Student stu1 = new Student("zhangsan", 23);
        Student stu2 = new Student("lisi", 24);
        Student stu3 = new Student("wangwu", 25);
        Student stu4 = new Student("zhaoliu", 26);


        TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o2.getAge() - o1.getAge();
                i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;

                return i;
            }
        });

        tm.put(stu1, "Beijing");
        tm.put(stu2, "shanghai");
        tm.put(stu3, "nanjing");
        tm.put(stu4, "guangzhou");

        System.out.println(tm);

    }
}
