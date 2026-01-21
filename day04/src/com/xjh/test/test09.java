package com.xjh.test;

import java.util.Scanner;

public class test09 {
    public static void main(String[] args) {
        //需求：给你一个整数，判断该数是否是回文数
        //回文数：正序和倒叙都一样

        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int n = sc.nextInt();
        while (true) {
            int ge = n % 10;
            n = n / 10;
            temp = temp * 10 + ge;
            if (n == 0) {
                break;
            }
        }
        System.out.println(temp);


    }
}
