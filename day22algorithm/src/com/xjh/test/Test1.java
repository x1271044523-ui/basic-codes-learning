package com.xjh.test;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Girlfriend g1 = new Girlfriend("azhangsan", 18, 168);
        Girlfriend g2 = new Girlfriend("bzhangsan", 19, 175);
        Girlfriend g3 = new Girlfriend("czhangsan", 18, 172);
        Girlfriend g4 = new Girlfriend("dzhangsan", 19, 170);
        Girlfriend g5 = new Girlfriend("bzhangsan", 18, 168);
        Girlfriend g6 = new Girlfriend("gzhangsan", 29, 178);
        Girlfriend g7 = new Girlfriend("hzhangsan", 39, 177);
        Girlfriend g8 = new Girlfriend("izhangsan", 49, 190);

        Girlfriend[] arr = {g1, g2, g3, g4, g5, g6, g7, g8};

        // ❓ 你的任务：用 Lambda 表达式写出排序逻辑
        // Arrays.sort(arr, ... );
        Arrays.sort(arr, (o1, o2) -> {
            // 1. 先算年龄差 (temp)
            int temp = o1.getAge() - o2.getAge();

            // 2. 判断：如果年龄不一样 (temp != 0)，直接返回年龄差
            // 如果年龄一样 (temp == 0)，就去算身高差 (注意是 o2 - o1 降序)
            temp = (temp == 0) ? o2.getHeight() - o1.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
            return temp;

        });

        // 打印结果
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Girlfriend {
    private String name;
    private int age;
    private int height;

    public Girlfriend(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public String getName() {
        return this.name;
    }


    @Override
    public String toString() {
        return "Girlfriend{name='" + name + "', age=" + age + ", height=" + height + '}';
    }
}