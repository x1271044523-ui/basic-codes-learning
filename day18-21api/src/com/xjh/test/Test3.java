package com.xjh.test;

public class Test3 {
    public static void main(String[] args) {
        //定义一个方法实现将10进制的数转化为2进制
        String binaryString = toBinaryString(110);
        System.out.println(binaryString);
    }

    private static String toBinaryString(int num) {
        if (num == 0) {
            return "0"; // 直接返回
        }
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int i = num % 2;
            num /= 2;
            sb.append(i);
        }
        String result = sb.reverse().toString();
        return result;
    }
}
