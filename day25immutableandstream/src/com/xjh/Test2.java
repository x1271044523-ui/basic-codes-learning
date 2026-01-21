package com.xjh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan,23", "lisi,24", "wangwu,25");

        //保留年龄大于等于24的人并将结果收集到map集合，名字为key，年龄为value
        Map<String, String> map = list.stream()
                .map(s->s.split(","))
                .filter(s->Integer.valueOf(s[1])>=24)
                .collect(Collectors.toMap(
                        s -> s[0]
                        ,
                        s -> s[1]
                ));
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry);
        }


    }
}
