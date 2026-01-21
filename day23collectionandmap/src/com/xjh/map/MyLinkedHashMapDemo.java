package com.xjh.map;

import java.util.LinkedHashMap;

public class MyLinkedHashMapDemo {
    public static void main(String[] args) {
        // ⭐ 重点：用 LinkedHashMap
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        //在hashmap的基础上多了一个有序
        map.put("c", 3);
        map.put("a", 1);
        map.put("b", 2);
        map.put("a", 4); // 覆盖 key="a" 的值，但不会改变它原本的顺序位置

        // 打印
        System.out.println(map);
    }
}
