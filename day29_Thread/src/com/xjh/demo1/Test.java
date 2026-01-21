package com.xjh.demo1;

public class Test {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();

        t1.start();
        t2.start();
    }
}
