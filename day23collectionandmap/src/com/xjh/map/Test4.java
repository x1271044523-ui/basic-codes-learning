package com.xjh.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
/*        假设老师给你乱敲了一串字母（或者一段很长的英文文章）：
        "aabbccaaaabbbccccddddddeee"
        你的任务：
        请告诉我，每一个字母分别出现了多少次？
（比如：a 出现了 6 次，b 出现了 5 次...）*/

        String str = "aabbccaaaabbbccccddddddeee";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (hm.containsKey(c)) {
                //集合内以及有该元素，累加
                Integer value = hm.get(c);
                value++;
                hm.put(c, value);
            } else {
                //集合内没有，添加
                hm.put(c, 1);
            }
        }
        //遍历集合
        hm.forEach((key, value) -> System.out.println(key + "出现了" + value + "次"));

        //entry遍历

        Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "出现了" + value + "次");
        }
    }
}
