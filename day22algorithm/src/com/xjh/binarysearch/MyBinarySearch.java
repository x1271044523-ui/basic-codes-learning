package com.xjh.binarysearch;

import java.lang.annotation.Target;

public class MyBinarySearch {
    //二分查找

    //            💡 核心逻辑提示（三步走）：
//    定义指针：min = 0, max = length - 1。
//    循环条件：while (min <= max)。
//    折半判断：
//    算 mid。
//    如果 arr[mid] > target：说明在左边，max 变小 (mid - 1)。
//    如果 arr[mid] < target：说明在右边，min 变大 (mid + 1)。
    public static void main(String[] args) {
//        需求：
//        定义一个方法 binarySearch(int[] arr, int target)。
//        数组：{7, 23, 79, 81, 103, 127, 131, 147}
//        目标：131
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int target = 131;
        int result = binarySearch(arr, target);
        System.out.println(result);

    }
    //二分查找的mid用下面这个公式计算就变成了插值查找
    //int mid = min + (max - min) * (key - arr[min]) / (arr[max] - arr[min]);
    public static int binarySearch(int[] arr, int target) {
        int min = 0, max = arr.length - 1;
        int mid = arr.length / 2;
        while (min <= max) {
            mid = (max + min) / 2;
            if (arr[mid] > target) {
                max = mid - 1;
            } else if (arr[mid] < target) {
                min = mid + 1;
            } else {
                //这里说明 arr[mid] = target
                return mid;

            }
        }
        return -1;

    }
}

