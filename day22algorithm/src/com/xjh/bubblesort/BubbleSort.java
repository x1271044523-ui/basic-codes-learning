package com.xjh.bubblesort;

public class BubbleSort {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {3, 1, 5, 4, 2};
        //相邻比较，大的后移

        //外层循环表示排序的次数
        //只需要排length-1次 因为前面都排好了最后一个也不用排了
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
