package com.xjh.a01mymath;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        // 1. 特殊情况处理：1 不是质数
        if (num == 1) {
            System.out.println("1 既不是质数也不是合数");
            return; // 直接结束
        }

        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(num + "是质数");
        }else {
            System.out.println(num + "不是质数");
        }
    }
}
