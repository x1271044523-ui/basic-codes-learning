package com.xjh.test;

public class Test05 {
    public static void main(String[] args) {
        //需求：定义一个数组，统计有多少个能被3整数
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("数组中能被3整数的个数为：" + count);


    }
}
