package com.xjh.test;

public class Test07 {
    public static void main(String[] args) {
        //需求：定义一个数组{1，2，3，4，5}，交换元素，交换后数组为{5，4，3，2，1}
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
