package com.xjh.test;

public class test04 {
    public static void main(String[] args) {
        //需求：已知三个人身高分别为150 210 165，请用程序实现获取这三个人的最高身高
        int a = 150;
        int b = 210;
        int c = 165;
        int max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println("最大的是"+max);
    }
}
