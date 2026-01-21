package com.xjh.collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //展示linkedlist的链表功能
        LinkedList list = new LinkedList<>();


// 栈 (Stack)：只用 addFirst 和 removeFirst (先进后出)。压子弹
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");

        Object first = list.removeFirst();
        System.out.println(list);//[c, b, a]

        //队列 (Queue)：用 addLast 和 removeFirst (先进先出)。食堂打饭
        LinkedList list2 = new LinkedList<>();
        list2.addLast("a");
        list2.addLast("b");
        list2.addLast("c");
        list2.addLast("d");

        list2.removeFirst();
        System.out.println(list2);//[b, c, d]


    }
}
