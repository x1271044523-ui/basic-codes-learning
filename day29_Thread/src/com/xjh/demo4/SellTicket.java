package com.xjh.demo4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Ballauma
 */
public class SellTicket implements Runnable {
    // 1. 定义票数 (成员变量，存在堆内存，被所有线程共享)
    // ⚠️ 注意：这里没有 static，因为我们只new一次 SellTicket 对象
    private int ticket = 100;
    private Lock lock = new ReentrantLock();


    @Override
    public void run() {

        while (true) {
            lock.lock();
            try {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
