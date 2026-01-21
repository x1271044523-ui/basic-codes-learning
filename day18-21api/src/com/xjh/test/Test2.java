package com.xjh.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //自己实现parseInt的效果，将字符串转成整数
        //字符串只能是数字。最少1位最多10位，不能0开头

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean result = s.matches("[1-9]\\d{0,9}");
        if (!result) {
            System.out.println("数据不合法");
            return;
        }
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ge = c - '0';
            sum = sum * 10 + ge;
        }
        System.out.println(sum);
    }
}
