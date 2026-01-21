package com.xjh.a03myobject;

public class User implements Cloneable {
    int age;
    int[] data; // 引用类型

    public User(int age, int[] data) {
        this.age = age;
        this.data = data;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // 直接调用 Object 的默认实现 -> 浅克隆
        return super.clone();
    }
}

