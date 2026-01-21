package com.xjh.test;

import java.util.Scanner;

public class StringTest02 {
    public static void main(String[] args) {
        //键盘录入一个字符串，统计大写字母小写字母数字的个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;

        for (int i = 0; i < str.length(); i++) {
            char chs = str.charAt(i);
            if (chs >= 'A' && chs <= 'Z') {
                countUpper++;
            } else if (chs >= 'a' && chs <= 'z') {
                countLower++;
            } else if (chs >= '0' && chs <= '9') {
                countNum++;
            }
        }
        System.out.println("大写字母的个数为：" + countUpper);
        System.out.println("小写字母的个数为：" + countLower);
        System.out.println("数字的个数为：" + countNum);
    }
}
