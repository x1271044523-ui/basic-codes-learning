package com.xjh.test;

public class MethodTest04 {
    public static void main(String[] args) {
        //设计一个方法，判断数组中是否存在某个数
        int[] arr = {1, 2, 3, 4, 5};
        boolean b = a(arr, 7);
        System.out.println(b);

    }
    public static boolean a(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target ){
                return true;
            }

        }
        return false;
    }
}

