package com.xjh.test.test3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Ballauma
 */
public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        Collections.addAll(list, 10, 20, 30, 50, 100);

        MyThread mt1 = new MyThread(list);
        MyThread mt2 = new MyThread(list);

        mt1.setName("抽奖机1");
        mt2.setName("抽奖机2");

        mt1.start();
        mt2.start();

    }
}
