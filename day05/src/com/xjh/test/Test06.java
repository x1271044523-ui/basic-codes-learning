package com.xjh.test;

public class Test06 {
    public static void main(String[] args) {
        //需求：定义一个数组，找出最大值
        int[] arr ={22,44,55,2,66};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("数组中的最大值为：" + max);
    }
}
