package com.xjh.test;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        //求质数
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 2; i < a; i++) {
            if (a % i == 0){
                System.out.println(a + "是质数");
                System.out.println(i);
                break;
            }
        }
    }
}
