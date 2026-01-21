package com.xjh.demo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            //charAt(i)方法可以获取字符串i索引上的字符
            System.out.println(str.charAt(i));
        }
    }
}
