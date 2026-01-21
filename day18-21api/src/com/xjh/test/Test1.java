package com.xjh.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入一些1-100之间的整数，并添加到集合之中
        //直到集合中所有数据和超过200为止
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;
        while (sum <= 200) {
            System.out.println("请输入一个1-100之间的整数");
            String s = sc.nextLine();
            int i = Integer.parseInt(s);
            if (i < 1 || i > 100) {
                System.out.println("数据错误");
                continue;
            }
            sum = sum + i;
            arrayList.add(i);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
