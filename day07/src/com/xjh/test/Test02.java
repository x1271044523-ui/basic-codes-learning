package com.xjh.test;


public class Test02 {
    public static void main(String[] args) {
        //判断101-200之间的数字是否为质数并输出

        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i + "不是质数");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i + "是质数");
            }
        }


    }

}
