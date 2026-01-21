package com.xjh.test.test2;

/**
 * @author Ballauma
 */
public class Test {
    public static void main(String[] args) {
        RedPacket rp = new RedPacket();

        Thread t1 = new Thread(rp,"一号");
        Thread t2 = new Thread(rp,"二号");
        Thread t3 = new Thread(rp,"三号");
        Thread t4 = new Thread(rp,"四号");
        Thread t5 = new Thread(rp,"五号");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
