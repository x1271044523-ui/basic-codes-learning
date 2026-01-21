package com.xjh.demo7;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Ballauma
 */
public class Cook implements Runnable{
    // 第一句：声明变量
// 意思就是：厨师心里知道，自己干活需要用到一个“管子”（队列）。
// 但是！现在这里是空的（null），他手里还没有真家伙。
    private ArrayBlockingQueue<String> queue;

    // 第二句：构造方法
// 意思就是：当你在 main 方法里 new Cook(...) 的时候，
// 必须顺手递给他一个管子！
    public Cook(ArrayBlockingQueue<String> queue) {

        // 第三句：赋值（核心！）
        // 把 main 方法里传进来的那个管子（局部变量 queue），
        // 塞到厨师自己的口袋里（成员变量 this.queue）。
        this.queue = queue;
    }


    @Override
    public void run() {
        while(true){
            try {
                queue.put("香喷喷的汉堡");
                //一个put方法代替了锁 判断是否有汉堡 唤醒睡眠机制
                System.out.println("厨师正在做汉堡");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
