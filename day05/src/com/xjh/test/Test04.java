package com.xjh.test;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //需求：获得一个1-100随机数字，猜大了提示大了，猜小了提示小了，猜对了提示猜对了
        Random r = new Random();
        int randomNumber = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你猜的数字");
            int guessNumber = sc.nextInt();
            if (guessNumber > randomNumber) {
                System.out.println("大了");
            } else if (guessNumber < randomNumber) {
                System.out.println("小了");
            } else {
                System.out.println("猜对了");
                break;

            }
        }


    }
}
