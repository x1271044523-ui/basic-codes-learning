package com.xjh.test;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        //假设商品总价1000
        //键盘录入会员级别，并计算实际支付的钱
        //会员1级打9折
        //会员2级打8折
        //会员3级打7折
        //非会员不打折
        Scanner sc=new Scanner(System.in);
        int level = sc.nextInt();
        if(level==1){
            System.out.println("会员1级打9折，实际支付"+(1000*0.9));
        }else if(level==2){
            System.out.println("会员2级打8折，实际支付"+(1000*0.8));
        }else if(level==3){
            System.out.println("会员3级打7折，实际支付"+(1000*0.7));
        }else{
            System.out.println("非会员不打折，实际支付"+1000);
        }
    }
}
