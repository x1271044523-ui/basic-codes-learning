package com.xjh.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMapDemo {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        map.put("zhangsan", "23");
        map.put("lisi", "24");
        map.put("wangwu", "25");

        map.put("zhangsan", "26");

        System.out.println(map);


        //遍历方式
        //1 拿着键找值
        Set<Object> keySet = map.keySet();

        for (Object key : keySet) {
            Object value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("=============================");

        //2.直接打印键值对
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry);
        }
        System.out.println("=============================");
        //3.lambda表达式
        map.forEach((o, o2) -> System.out.println(o + "=" + o2));



        Student stu1 = new Student("zhangsan", 23);
        Student stu2 = new Student("lisi", 24);
        Student stu3 = new Student("lisi", 24);

        Map<Student, String> m = new HashMap<>();
        m.put(stu1, "001");
        m.put(stu2, "002");
        m.put(stu3, "003");

        for (Map.Entry<Student, String> studentStringEntry : m.entrySet()) {
            System.out.println(studentStringEntry);
        }
    }
}
