package com.xjh.collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
//        arraylist底层是 Object[] 数组。
//        初始容量 0，第一次添加时变为 10。
//        每次扩容是原来的 1.5 倍，通过 Arrays.copyOf (底层是 System.arraycopy) 实现数据搬运。

        ArrayList<Object> list = new ArrayList<>();//此时底层list集合长度为0

        list.add("aaa");//此时才将集合size改为10

        //当集合满了10个之后，再次添加一个则会触发扩容机制调用copyof方法将底层的数组copy到一个新的数组
        //新的数组大小为15，但是如果一次添加的元素过多，15放不下，则以实际元素数量为新数组大小
    }
}
