package com.xjh.test;

public class Test2 {
    public static void main(String[] args) {
        //不死神兔
        System.out.println(getSum(12));
    }


    public static int getSum(int month) {
        if (month == 1 || month == 2) {
            return 1;
        }
        return getSum(month - 1) + getSum(month - 2);
    }
}
