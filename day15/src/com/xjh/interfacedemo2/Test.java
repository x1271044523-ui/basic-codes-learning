package com.xjh.interfacedemo2;

public class Test implements Inter{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {
        Inter.super.method2();
    }
}
