package com.xjh.test.test1;

/**
 * @author Ballauma
 */
public class Test1 {
    public static void main(String[] args) {
        Ticeket ticeket = new Ticeket();

        Thread t1 = new Thread(ticeket,"t1");
        Thread t2 = new Thread(ticeket,"t2");

        t1.start();
        t2.start();
    }
}
