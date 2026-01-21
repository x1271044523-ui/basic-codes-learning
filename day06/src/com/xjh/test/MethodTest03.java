package com.xjh.test;

public class MethodTest03 {
    public static void main(String[] args) {
        //设计一个方法，打印数组的元素 效果为：[1,2,3,4,5]
        int[] arr = {1, 2, 3, 4, 5};
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                //i<arr.length-1 则说明不是最后一个元素
                System.out.print(arr[i] + ",");
            } else {
                //是最后一个元素
                System.out.print(arr[i]);
            }

        }
        System.out.print("]");
    }
}
