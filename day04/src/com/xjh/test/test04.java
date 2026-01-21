package com.xjh.test;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        //需求：键盘录入星期，显示今天的减肥活动
        Scanner sc = new Scanner(System.in);
        System.out.println("输入今天的星期（1-7）");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("吃一顿");
                break;
            default:
                System.out.println("输入错误");
                break;

        }
    }
}
