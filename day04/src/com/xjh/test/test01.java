package com.xjh.test;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        //需求，键盘录入一个数字，判断这个数字是否大于100
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >100){
            System.out.println("大于100");
        }else{
            System.out.println("小于100");
        }
    }
}
