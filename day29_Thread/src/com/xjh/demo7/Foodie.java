package com.xjh.demo7;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Ballauma
 */
public class Foodie implements Runnable {
    private ArrayBlockingQueue queue;

    public Foodie(ArrayBlockingQueue queue) {
        this.queue = queue;

    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.take();
                //一个put方法代替了锁 判断是否有汉堡 唤醒睡眠机制
                System.out.println("吃货正在吃汉堡");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
