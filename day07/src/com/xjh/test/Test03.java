package com.xjh.test;

import java.util.Random;

public class Test03 {
    public static void main(String[] args) {


        //开发验证码，前四位随机大小写字母，后一位随机0-9数字
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) ('A' + i);
            } else {
                chs[i] = (char) ('a' + i - 26);
            }
        }
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(52);
            result = result + chs[randomIndex];
        }

        int randomNum = r.nextInt(10);
        result = result + randomNum;
        System.out.println(result);

    }
}
