package com.xjh.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        //arrays 工具类方法演示

        Integer[] arr = {1, 4, 65, 8, 3, 45, 3, 56, 567, 23, 2123};

        //arrays的二分查找方法，这里数组不是有序的所以代码会错
        int binarySearch = Arrays.binarySearch(arr, 4);
        System.out.println(binarySearch);

        //copyof复制数组方法和tostring将数组变成字符串方法
        Integer[] copyOfInts = Arrays.copyOf(arr, 10);
        String string = Arrays.toString(copyOfInts);
        System.out.println(string);

        //sort方法 对于引用数据类型底层为归并排序+插入排序 基本数据类型为双轴快速排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        //这个匿名内部类改变排序方式的方法只能对引用数据类型使用，所以得用integer
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //这里o1-o2就是升序排序 o2-o1就是降序排序
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
