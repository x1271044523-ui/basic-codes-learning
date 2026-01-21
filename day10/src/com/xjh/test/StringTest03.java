package com.xjh.test;

public class StringTest03 {
    public static void main(String[] args) {
        //将数组中的元素拼接成一个字符串 {1, 2, 3, 4, 5} -> [1, 2, 3, 4, 5]
        int[] arr = {1, 2, 3, 4, 5};
        String string = arrtoString(arr);
        System.out.println(string);
    }

    public static String arrtoString(int[] arr) {
        if(arr == null){
            return "null";
        }
        if (arr.length == 0){
            return "[]";
        }


        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            if (i == arr.length - 1) {
                s = s + "]";
            } else {
                s = s + ", ";
            }
        }
        return s;
    }


}
