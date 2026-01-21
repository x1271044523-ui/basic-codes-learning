package com.xjh.test;

import java.util.Scanner;

public class StringTest07 {
    public static void main(String[] args) {
        //用stringbuilder判断回文数
        Scanner sc = new Scanner(System.in);
        String i = sc.next();

        StringBuilder sb = new StringBuilder();
        sb.append(i);

        String string = sb.reverse().toString();
        if (string.equals(i)){
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }
    }
}
