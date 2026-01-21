package com.xjh.methods;

/**
 * @author Ballauma
 */
public class sleepMethods {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i > 0; i--) {
            System.out.println("火箭发射倒计时" + i);
            Thread.sleep(1000);
        }
    }
}
