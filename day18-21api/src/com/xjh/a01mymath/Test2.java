package com.xjh.a01mymath;


public class Test2 {
    public static void main(String[] args) {
        //判断水仙花数有几个
        //水仙花数：3位自然数等于自身各位上数字的3次幂之和
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            double v = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (v == i){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("水仙花数有"+count+"个");


    }
}
