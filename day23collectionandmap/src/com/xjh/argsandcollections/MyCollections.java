package com.xjh.argsandcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyCollections {
    public static void main(String[] args) {

//        Collections是一个给集合用的工具类，包括addall()方法一次添加多个元素
        //shuffle()方法，打乱集合等
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);
        Collections.shuffle(list);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
