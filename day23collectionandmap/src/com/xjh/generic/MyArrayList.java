package com.xjh.generic;

import java.util.Arrays;

public class MyArrayList<E> {
    private Object[] obj = new Object[10];
    private int index = 0;



    public void add(E e){
        obj[index] = e;
        index++;
    }

    public E get(int index){
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "obj=" + Arrays.toString(obj) +
                ", index=" + index +
                '}';
    }
}
