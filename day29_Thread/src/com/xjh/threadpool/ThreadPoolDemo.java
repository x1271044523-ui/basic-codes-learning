package com.xjh.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Ballauma
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            int temp = i;

            pool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "正在执行" + temp);

                }
            });
        }
        pool.shutdown();
    }
}
