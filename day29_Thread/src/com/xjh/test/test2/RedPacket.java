package com.xjh.test.test2;

import java.util.Random;

/**
 * @author Ballauma
 */
public class RedPacket implements Runnable {
    static int money = 1000;
    static Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (money <= 0) {
                    System.out.println(Thread.currentThread().getName() + "没抢到");
                    break;
                }
                Random r = new Random();
                int i = r.nextInt(money + 1);
                money = money - i;
                System.out.println(Thread.currentThread().getName() + "抢到了" + i + "元");

            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
