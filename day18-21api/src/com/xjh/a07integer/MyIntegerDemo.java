package com.xjh.a07integer;

import java.util.Scanner;

public class MyIntegerDemo {
    public static void main(String[] args) {
//只有一个重点 数据类型转化
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        String s = sc.nextLine();
        int i = Integer.parseInt(s);
        System.out.println(i);

    }
}
