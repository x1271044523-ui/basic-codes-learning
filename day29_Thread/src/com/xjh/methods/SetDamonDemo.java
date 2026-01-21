package com.xjh.methods;

/**
 * @author Ballauma
 */
public class SetDamonDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("我是备胎线程..." + i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("我是主要线程" + i);
                }

            }
        });

        //备胎线程会在其他普通线程结束之后自动结束，即使自己的任务还没完成
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}
