package com.xjh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyImmutableDemo {
    public static void main(String[] args) {
        //不可变集合
        List<String> list = List.of("zhangsan", "lisi", "wangwu");
//        list.add("zhaoliu"); UnsupportedOperationException不支持的操作异常 不可变集合不能修改

        Set<Object> set = Set.of();

        HashMap hm = new HashMap<>();
        Map<Object, Object> map = Map.copyOf(hm);
    }
}
