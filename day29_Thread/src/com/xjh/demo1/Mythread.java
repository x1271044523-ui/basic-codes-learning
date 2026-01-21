package com.xjh.demo1;

/**
 * @author Ballauma
 */
public class Mythread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "正在运行" + i);
        }
    }
}
