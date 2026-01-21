package com.xjh.methods;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("大汉正在吃包子");
                }
            }
        });

        t1.start();
        t1.join();
        //先start(开始)再join(插队)


        System.out.println("主线程正在吃包子");
    }
}
