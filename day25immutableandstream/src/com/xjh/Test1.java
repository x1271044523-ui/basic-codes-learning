package com.xjh;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        //定义一个集合，并添加一些整数1，2，3，4，5，67，8，9，10
        //过滤奇数只保留偶数，并将结果保存起来
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array = Arrays.stream(ints).filter(s -> s % 2 == 0).toArray();
        for (int i : array) {
            System.out.println(i);
        }
    }
}
