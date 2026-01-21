package com.xjh.test;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        //需求：键盘录入一个三位数，将其拆分为个位十位百位打印在控制台
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int ge = a % 10;
        int shi = a / 10 % 10;
        int bai = a / 100 % 10;

        System.out.println("个位是" + ge);
        System.out.println("十位是" + shi);
        System.out.println("百位是" + bai);

    }
}
