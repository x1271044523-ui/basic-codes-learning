package com.xjh.argsandcollections;

public class Args {
    public static void main(String[] args) {
        //可变参数 一个方法只能写一个可变参数，可变参数必须写在最后
        int sum = getSum(1, 2, 3, 4, 5);
        System.out.println(sum);
    }
    //                          args底层就是个数组
    public static int getSum(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + args[i];
        }
        return sum;
    }
}
