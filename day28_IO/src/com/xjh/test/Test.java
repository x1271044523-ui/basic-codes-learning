package com.xjh.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Ballauma
 */
public class Test {
    public static void main(String[] args) {
        List<String> students = List.of(
                "张三,90",
                "李四,85",
                "王五,95",
                "赵六,85"
        );
        /*任务要求：
        请你用 Stream 流 的方式，实现以下两个功能，并把代码写出来：
        筛选：找出所有 分数大于 85 分 的学生。
        收集：把筛选出来的学生，收集到一个 Map 集合中，其中 键 (Key) 是学生姓名，值 (Value) 是学生分数（整数类型）。*/

        Map<String, Integer> collect = students.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) > 85)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.valueOf(s.split(",")[1])
                ));
        for (Map.Entry<String, Integer> stringIntegerEntry : collect.entrySet()) {
            System.out.println(stringIntegerEntry);
        }
    }
}
