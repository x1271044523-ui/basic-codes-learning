package com.xjh.demo2;

/**
 * @author Ballauma
 */
public class MyRun implements Runnable {
    @Override
    public void run() {
        // 获取当前线程的对象（因为 Runnable 不是 Thread 的子类，不能直接用 getName）
        Thread t = Thread.currentThread();

        for (int i = 0; i < 100; i++) {
            System.out.println(t.getName() + " 正在执行: " + i);
        }
    }
}
