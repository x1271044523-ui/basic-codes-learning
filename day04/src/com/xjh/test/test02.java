package com.xjh.test;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {

        //需求
        //假设某电影院卖了100张票,票的序号为0-100
        //其中奇数票号坐左边，偶数坐右边
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=0 && n<=100){
            if (n % 2 == 0) {
                System.out.println("偶数票号坐右边");
            }else{
                System.out.println("奇数票号坐左边");
            }
        }

    }
}
