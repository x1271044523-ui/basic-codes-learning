package com.xjh.test;

import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        //需求：键盘录入两个数字，求这两个数字范围内既能被3整除又能被5整除的数字的个数
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for (int i = n; i <= m; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
