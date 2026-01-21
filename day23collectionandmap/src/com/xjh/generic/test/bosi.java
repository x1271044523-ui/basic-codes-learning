package com.xjh.generic.test;

public class bosi extends Cat {

    @Override
    public void eat() {
        System.out.println(
                "一直叫作" + this.getName() + "的，" + this.getAge() + "岁的波斯猫，正在吃小饼干"
        );
    }

    public String toString() {
        return "bosi{}";
    }
}
