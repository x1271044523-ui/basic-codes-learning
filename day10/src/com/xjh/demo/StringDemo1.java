package com.xjh.demo;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        String s3 = "Abc";
        // 字符串的比较
        // == 比较的是字符串的地址是否相同
        // equals 比较的是字符串的内容是否相同
        // equalsIgnoreCase 比较的是字符串的内容是否相同，忽略大小写
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
        System.out.println(s2.equalsIgnoreCase(s3));//true
    }
}
