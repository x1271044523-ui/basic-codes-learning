package com.xjh.selectionsort;

public class SelectionSort {
    public static void main(String[] args) {
        // 选择排序
        //每次循环选出一个最小的和最左边的交换
        int[] arr = {2, 3, 1, 5, 4};


        for (int j = 0; j < arr.length - 1; j++) {
            int minIndex = j;
            for (int i = minIndex + 1; i < arr.length; i++) {
                //循环找出最小数字的索引
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            //循环结束将最小数字与j索引数字交换
            if (minIndex != j) {
                int temp = arr[j];
                arr[j] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
