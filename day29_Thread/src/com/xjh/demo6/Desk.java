package com.xjh.demo6;

/**
 * @author Ballauma
 */
public class Desk {
    //foodFlag 0表示桌子上没有汉堡 1表示桌子上还有汉堡
    public static int foodFlag = 0;

    //count 表示吃货还能吃的数量
    public static int count = 10;

    //锁对象
    public static Object lock = new Object();
}
