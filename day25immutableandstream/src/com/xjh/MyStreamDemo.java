package com.xjh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class MyStreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰", "张无忌", "周芷若", "赵敏", "张强");
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() >= 3)
                .forEach(s -> System.out.println(s));

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "zhangsan", "lisi", "wangwu");

        list2.stream()
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));


        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "张三-18", "李四-20", "张无忌-100", "王五-25", "张三丰-120");

        List<String> zhanglist = list3.stream()
                .filter(s -> s.startsWith("张"))
                .collect(Collectors.toList());
        System.out.println(zhanglist);


        ArrayList<String> list4 = new ArrayList<>();
        Collections.addAll(list4, "张三-18", "李四-20", "张无忌-100", "王五-25", "张三丰-120");

        Map<String, Integer> collect = list4.stream()
                .filter(s -> s.startsWith("张"))
                .collect(Collectors.toMap(
                        new Function<String, String>() {
                            @Override
                            public String apply(String s) {
                                String[] strings = s.split("-");
                                return strings[0];
                            }
                        }
                        ,
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                String[] strings = s.split("-");
                                Integer value = Integer.valueOf(strings[1]);
                                return value;
                            }
                        }
                ));
        collect.forEach((s, integer) -> System.out.println(s + "=" + integer));
    }
}
