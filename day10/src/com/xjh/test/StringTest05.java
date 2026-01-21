package com.xjh.test;

import java.util.Scanner;

public class StringTest05 {
    public static void main(String[] args) {
        // 大写数字表（索引0对应零，索引1对应壹...）
        char[] bigDirs = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};

        // 单位表（从后往前数）
        String[] units = {"元", "拾", "佰", "仟", "万", "拾", "佰"};

//        第一步：数字转大写
//        写一个方法 getCapitalNumber(int number)。
//        输入 2，返回 '贰'。
//        (提示：利用查表法，直接用数字当索引去 bigDirs 数组里拿)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();

        String capitalNumber = getCapitalNumber(bigDirs, number);


//        第二步：补齐 7 位字符串
//        输入 2135。
//        先变成大写字符串："贰壹叁伍"。
//        然后发现它只有 4 位，不够 7 位。
//        需要在前面补 3 个 '零'。
//        结果变成："零零零贰壹叁伍"。
        while (capitalNumber.length() < 7) {
            capitalNumber = "零" + capitalNumber;
        }

//        第三步：插入单位 (最难的一步)
//        创建一个最终的字符串。
//        遍历上面那个 7 位的大写字符串。
//        第 0 个字符 + units[6] ("佰")
//        第 1 个字符 + units[5] ("拾")
//...
//        第 6 个字符 + units[0] ("元")

        //213
        String s = "";
        for (int i = 0; i < capitalNumber.length(); i++) {
            char c = capitalNumber.charAt(i);
            String s1 = c + units[6 - i];//s1指的是第i个字符和单位的拼接
            s = s + s1;//s为最终结果
        }
        System.out.println(s);

    }

    public static String getCapitalNumber(char[] bigDirs, int number) {
        String s = "";
        //将数字转换成汉字
        while (number > 0) {
            int ge = number % 10;
            number = number / 10;
            s = bigDirs[ge] + s;
        }
        return s;

    }
}
