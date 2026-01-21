package com.xjh.demo;

public class StringDemo3 {
    public static void main(String[] args) {
        String phoneNumber = "13112345353";

        String start = phoneNumber.substring(0, 3);
        String end = phoneNumber.substring(7);

        String num = start + "****" + end;
        System.out.println(num);
    }
}
