package com.xjh.test;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        //键盘录入两个整数
        //如果其中一个是6，那么最终结果输出true
        //如果他们的和为6的倍数，那么最终结果输出true，其他情况都是false
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a==6||b==6||(a+b)%6==0);
    }
}
