package com.xjh.test;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        //找平方根
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i < a; i++) {
            if (i * i == a) {
                System.out.println(i + "是" + a + "的平方根");
            } else if (i * i > a) {
                System.out.println((i - 1) + "是" + a + "平方根的整数部分");
                break;
            }
        }
    }
}
