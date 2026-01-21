package com.xjh.test;

public class test01 {

    public static void main(String[] args) {
        //逢7过
        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
            if (i %10 == 7) {
                System.out.println(i);
            }
            if (i /10 == 7) {
                System.out.println(i);
            }

        }
    }
}

