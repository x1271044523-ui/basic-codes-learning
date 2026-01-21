package com.xjh.test;

public class MethodTest02 {
    public static void main(String[] args) {
        //使用方法重载的思想，设计一个方法，用于计算两个类型的整数的和（byte,short,int,long）
        byte a = 10;
        byte b = 20;
        byte sum = getSum(a, b);
        System.out.println(sum);


    }

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static byte getSum(byte a, byte b) {
        byte sum = (byte)(a + b);
        return sum;
    }
    public static short getSum(short a, short b) {
        short sum = (short)(a + b);
        return sum;
    }
    public static long getSum(long a, long b) {
        long sum = a + b;
        return sum;
    }

}
