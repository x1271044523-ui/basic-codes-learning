package com.xjh.test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //评委打分，去掉一个最高分和一个最低分，求平均分

        //1.定义数组，存储评委的打分
        int[] grade = grade();

        //2.求出最高分
        int max = getMax(grade);


        //3.求出最低分
        int min = getMin(grade);


        //4.用总分减去最高分最低分 除以 4
        int sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        System.out.println("去掉最高分和最低分后的平均分是：" + (sum - max - min) / (grade.length - 2));
    }

    public static int getMin(int[] grade) {
        int min = grade[0];
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] < min) {
                min = grade[i];
            }
        }
        return min;
    }

    public static int[] grade() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委的打分");
            int num = sc.nextInt();
            if (num >= 0 && num <= 100) {
                scores[i] = num;
                i++;
            } else {
                System.out.println("输入的分数有误");
            }

        }
        return scores;
    }

    public static int getMax(int[] grade) {
        int max = grade[0];
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] > max) {
                max = grade[i];
            }
        }
        return max;
    }

}
