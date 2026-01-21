package com.xjh.demo3;

/**
 * @author Ballauma
 */
public class Test {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");


        t1.start();
        t2.start();
    }
}
