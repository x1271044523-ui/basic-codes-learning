package com.xjh.test;

import java.util.Scanner;

public class StringTest04 {
    public static void main(String[] args) {
        //键盘录入一个字符串，调用一个方法，让其变为反转的字符串
        //例如：键盘录入"abc"，调用方法后，返回"cba"
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        String reverse = reverseString(str);
        System.out.println(reverse);
    }

    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }
        return s;
    }

}
