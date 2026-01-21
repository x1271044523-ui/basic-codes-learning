package com.xjh.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //某个班级80个学生，四个景点abcd，统计哪个景点想去的人最多

        String[] arr = {"A", "B", "C", "D"};
        Random random = new Random();
        int[] arr2 = new int[80];
        for (int i = 0; i < 80; i++) {
            int p = random.nextInt(4);
            arr2[i] = p;
        }
        System.out.println(Arrays.toString(arr2));

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < 80; i++) {
            if (hm.containsKey(arr[arr2[i]])) {
                Integer i1 = hm.get(arr[arr2[i]]);
                i1 = i1 + 1;
                hm.put(arr[arr2[i]], i1);
            } else {
                hm.put(arr[arr2[i]], 1);
            }
        }
        String name = "";
        int max = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : hm.entrySet()) {
            Integer value = stringIntegerEntry.getValue();
            String key = stringIntegerEntry.getKey();

            if (value > max) {
                max = value;
                name = key;
            }

        }

        System.out.println("获得投票最多的是" + name + "共有" + max + "票");
    }
}
