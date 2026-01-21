package com.xjh.a01staticdemo1;

public class TestDemo {
    public static void main(String[] args) {
        int[] ints ={1,2,3,4,5};
        float[] floats ={1,2,3,4,5};

        System.out.println(ArrUtil.printArr(ints));
        System.out.println(ArrUtil.getAverage(floats));
    }
}
