package com.xjh.test;

public class Test06 {
    public static void main(String[] args) {
        //利用二维数组，存储某商城每个季度的营业额
        //需求：计算出每个季度的总营业额和全年的总营业额
        int[][] sales = new int[][]{{22, 66, 44}, {33, 88, 11}, {44, 77, 55}, {66, 33, 22}};
        //计算每个季度的营业额
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            int sum = 0;
            for (int j = 0; j < sales[i].length; j++) {
                sum += sales[i][j];
                total += sales[i][j];

            }
            System.out.println("第" + (i + 1) + "季度营业额" + sum);

        }
        System.out.println("全年营业额" + total);

    }
}
