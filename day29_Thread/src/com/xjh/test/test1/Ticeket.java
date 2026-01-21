package com.xjh.test.test1;

/**
 * @author Ballauma
 */
public class Ticeket implements Runnable {
    static int ticekets = 1000;
    static Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (ticekets == 0) {
                    break;
                }
                ticekets--;
                System.out.println(Thread.currentThread().getName() + "发了一张票,还剩" + ticekets + "张票");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
