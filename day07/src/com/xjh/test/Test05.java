package com.xjh.test;

import java.util.Random;

public class Test05 {
    public static void main(String[] args) {

        //现在有一个奖池{100,200,300,400,500}，需要随机抽取并打印，要求不能有重复
        int[] pool = {100, 200, 300, 400, 500};
        //定义一个新数组存储抽到的奖励
        int[] result = new int[pool.length];
        //随机抽取
        Random r = new Random();

        for (int i = 0; i < 5; ) {
            int randomIndex = r.nextInt(pool.length);

            if (isPrizeNotDrawn(result, pool[randomIndex])) {
                //判断该奖项是否已经被抽过了,没被抽过返回true

                result[i] = pool[randomIndex];
                i++;

            }
        }
        //打印结果
        for (int i = 0; i < result.length; i++) {
            System.out.println("第" + (i + 1) + "个奖项是：" + result[i]);
        }

    }

    public static boolean isPrizeNotDrawn(int[] result, int prize) {
        for (int i = 0; i < result.length; i++) {
            if (result[i] == prize) {
                //说明该奖项已经被抽过了,不能重复
                return false;
            }
        }
        //说明该奖项还没有被抽过,可以放进数组
        return true;
    }
}
