package com.xjh.set;

import java.util.HashSet;
import java.util.Set;

public class MySetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("aaa");
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");

        //set集合不能重复
        System.out.println(set);

        //set集合没有索引

    }
}
