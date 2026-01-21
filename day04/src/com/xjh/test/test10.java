package com.xjh.test;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        //需求:给两个整数，将两数相除，得到商和余数，不使用乘法除法和%
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个大整数:");
        int n = sc.nextInt();
        System.out.println("请输入第二个小整数:");
        int m = sc.nextInt();

        int count = 0;
        while (n>=m) {
            n=n-m;
            count++;
        }
        System.out.println("商"+count);
        System.out.println("余数"+n);

    }
}
