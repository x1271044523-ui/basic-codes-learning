package com.xjh.generic.test;

public class lihua extends Cat{
    @Override
    public void eat() {
        System.out.println(
                "一直叫作" + this.getName() + "的，" + this.getAge() + "岁的梨花猫，正在吃小饼干"
        );
    }
}
