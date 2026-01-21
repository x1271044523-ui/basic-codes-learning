package com.xjh.demo6;

/**
 * @author Ballauma
 */
public class Foodie implements Runnable {

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    System.out.println("吃货吃饱了");
                    break;
                }
                if (Desk.foodFlag == 0) {
                    //桌子上没有汉堡，自己休息喊厨师做
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    //桌子上有汉堡，吃
                    System.out.println("吃货正在吃汉堡");
                    Desk.foodFlag = 0;
                    Desk.count--;
                    Desk.lock.notifyAll();
                }

            }
        }
    }
}
