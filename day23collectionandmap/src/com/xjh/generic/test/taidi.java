package com.xjh.generic.test;

public class taidi extends Dog{
    @Override
    public void eat() {
        System.out.println(
                "一直叫作" + this.getName() + "的，" + this.getAge() + "岁的泰迪，正在吃小饼干"
        );
    }
}
