package com.xjh.map;

import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        //需求，key=id，value=name，按照id升序排序降序排序
        //java里integer已经实现了comparable接口，会自动升序排序
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "保温杯");
        tm.put(3, "电脑");
        tm.put(2, "手机");

        System.out.println(tm);

        //在创建集合的时候传递比较器对象则会按照指定的规则排序
        TreeMap<Integer, String> tm2 = new TreeMap<>((o1, o2) -> o2 - o1);
        tm2.put(1, "保温杯");
        tm2.put(3, "电脑");
        tm2.put(2, "手机");

        System.out.println(tm2);
    }
}
