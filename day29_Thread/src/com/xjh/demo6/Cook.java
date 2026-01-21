package com.xjh.demo6;

/**
 * @author Ballauma
 */
public class Cook implements Runnable {

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                }
                //先判断有没有汉堡
                if (Desk.foodFlag == 1) {
                    //有汉堡，直接休息
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    //没有汉堡，做一个
                    System.out.println("厨师正在做汉堡");
                    Desk.foodFlag = 1;
                    //做完了喊吃货来吃
                    Desk.lock.notifyAll();
                }
            }
        }
    }
}
