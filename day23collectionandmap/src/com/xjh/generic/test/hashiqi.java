package com.xjh.generic.test;

public class hashiqi extends Dog{
    @Override
    public void eat() {
        System.out.println(
                "一直叫作" + this.getName() + "的，" + this.getAge() + "岁的哈士奇，正在吃小饼干"
        );
    }
}
