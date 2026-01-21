package com.xjh.test;

import java.util.Random;

public class StringTest09 {
    public static void main(String[] args) {
        //生成验证码
        char[] chs = new char[52];
        for (int i = 0; i < 26; i++) {
            chs[i] = (char) ('A' + i);
        }
        for (int i = 0; i < 26; i++) {
            chs[i + 26] = (char) ('a' + i);
        }
        Random r = new Random();

        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(52);
            result = chs[randomIndex] + result;

        }
        int randomNum = r.nextInt(10);
        result += randomNum;
        System.out.println(result);

        char[] charArray = result.toCharArray();
        int randomIndex = r.nextInt(4);
        char temp = charArray[charArray.length - 1];
        charArray[charArray.length - 1] = charArray[randomIndex];
        charArray[randomIndex] = temp;

        System.out.println(charArray);

    }
}
