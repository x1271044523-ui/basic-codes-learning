package com.xjh.test.test3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Ballauma
 */
public class MyThread extends Thread{
    private ArrayList list;

    public MyThread(ArrayList list) {
        this.list = list;
    }
    @Override
    public void run() {
        while (true){
            synchronized (MyThread.class){
                if (list.isEmpty()){
                    break;
                }else {
                    Collections.shuffle(list);
                    Object re = list.remove(0);
                    System.out.println(getName()+"抽中了"+re+"大奖");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

