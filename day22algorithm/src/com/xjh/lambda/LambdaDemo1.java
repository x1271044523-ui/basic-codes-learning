package com.xjh.lambda;


import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {

    public static void main(String[] args) {

        method(() -> System.out.println("hello,lambda"));

        String[] arr = {"a", "aaaa", "aaa", "aa"};
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        String string = Arrays.toString(arr);
        System.out.println(string);
    }


    public static void method(Runnable r) {
        r.run();
    }
}
