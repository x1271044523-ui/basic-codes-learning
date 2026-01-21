package com.xjh.test;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        //需求：键盘录入星期，判断今天是工作日还是休息日
        Scanner sc = new Scanner(System.in);
        System.out.println("输入今天的星期（1-7）");
        int week = sc.nextInt();
        //case穿透：如果case语句中没有break语句，程序会继续执行下一个case语句，直到遇到break语句或者switch语句结束
        switch (week) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("今天是工作日");
                break;
            case 6:
            case 7:
                System.out.println("今天是工作日");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
