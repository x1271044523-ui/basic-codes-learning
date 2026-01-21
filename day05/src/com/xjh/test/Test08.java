package com.xjh.test;

import java.util.Random;

public class Test08 {
    //需求，定义一个数组，随机打乱元素
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomNumber = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomNumber];
            arr[randomNumber] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
