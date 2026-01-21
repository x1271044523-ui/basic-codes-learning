package com.xjh.test;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        //键盘录入两个数，比较大小
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("比较大的是"+(a>=b?a:b));
    }
}
