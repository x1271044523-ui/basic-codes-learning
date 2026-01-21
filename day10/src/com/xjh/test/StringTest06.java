package com.xjh.test;

public class StringTest06 {
    public static void main(String[] args) {
        /* 定义一个方法把int数组中的数据按照指定格式拼成一个字符串返回 */
        int[] arr = {1,2,3};
        String str = arrToString(arr);
        System.out.println(str);


    }

    public static String arrToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i<arr.length-1){
                sb.append(arr[i]);
                sb.append(",");
            }else {
                sb.append(arr[i]);
            }


        }
        sb.append("]");

        String str = sb.toString();

        return str;
    }
}
