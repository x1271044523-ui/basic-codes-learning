package com.xjh.demo;

public class StringDemo4 {
    public static void main(String[] args) {
        //String的replace方法
        String str = "你TMD真是一个大SB";


        String[] strs = {"TMD","SB","CNM"};
        for (int i = 0; i < strs.length; i++) {
            str = str.replace(strs[i], "***");
        }
        System.out.println(str);


    }
}
