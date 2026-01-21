package com.xjh.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        Iterator it = coll.iterator();
//        //迭代器遍历
//        while (it.hasNext()){
//            Object next = it.next();
//            System.out.println(next);
//        }

        //增强for遍历
        for (Object o : coll) {
            System.out.println(o);
        }

//        💣 高能预警：并发修改异常 (ConcurrentModificationException)
//        这是面试必考题，也是新手必踩的坑！
//        千万不要 在迭代器遍历的时候，用 集合自己 的方法去删元素！

        while (it.hasNext()){
            Object next = it.next();
            // ❌ 报错！集合说：我在遍历呢，谁让你动我的数据？
//            coll.remove("aaa");

            // ✅ 正确：用迭代器自己的刀来删
            it.remove();
            System.out.println(next);
        }

        //lambda表达式遍历
        coll.forEach( o -> System.out.println(o));

    }
}
