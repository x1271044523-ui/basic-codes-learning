package com.xjh.demo3;

/**
 * @author Ballauma
 */
public class SellTicket implements Runnable {
    // 1. 定义票数 (成员变量，存在堆内存，被所有线程共享)
    // ⚠️ 注意：这里没有 static，因为我们只new一次 SellTicket 对象
    private int ticket = 100;


    @Override
    public void run() {

        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                } else {
                    break;
                }
            }
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
