package com.xjh.test;

public class Test3 {
    public static void main(String[] args) {
        //猴子吃桃子
        System.out.println(getCount(1));


    }

    public static int getCount(int day) {
        if (day == 10) {
            return 1;
        }

        return (getCount(day + 1) + 1) * 2;
    }
}
