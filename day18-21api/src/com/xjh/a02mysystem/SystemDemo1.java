package com.xjh.a02mysystem;

public class SystemDemo1 {
    public static void main(String[] args) {
        //获取cup线程数
        System.out.println(Runtime.getRuntime().availableProcessors());
        //获取总内存大小，单位kb
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
        //以及获取的内存
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
        //剩余内存
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);



    }
}
