package com.xjh.test;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringTest08 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        //要求1：长度小于等于9
        //要求2：只能是数字
        String str = scPrint();
        String romaNum = toRomaNum(str);
        System.out.println(romaNum);

        //将内容变成罗马数字


    }

    public static String toRomaNum(String str) {
        String[] romaNum = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        //查表法
//        String result = "";
        StringJoiner sj = new StringJoiner(",");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = c - '0';//将字符串变成int类型

            sj.add(romaNum[num]);
//            result = romaNum[num] + result + ", ";
        }
        String result = sj.toString();
        return result;

    }

    public static String scPrint() {
        Scanner sc = new Scanner(System.in);

        // 【关键修改】开启死循环，直到用户输入正确为止
        while (true) {
            System.out.println("请输入一个长度<=9的纯数字字符串：");
            String str = sc.next();

            // 1. 校验长度
            if (str.length() > 9) {
                System.out.println("❌ 长度不能超过9，请重输！");
                continue; // 跳过本次循环剩余代码，重新开始下一轮
            }

            // 2. 校验是否全是数字
            boolean isNumber = true;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c < '0' || c > '9') {
                    isNumber = false; // 发现坏蛋（非数字）
                    break;
                }
            }

            // 3. 最终审判
            if (isNumber) {
                return str; // ✅ 只有这里才能跳出循环并返回
            } else {
                System.out.println("❌ 内容包含非数字，请重输！");
                // 这里的 else 会导致循环继续，也就是重输
            }
        }
    }

}
