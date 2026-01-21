package com.xjh.blocksearch;

public class BlockSearch {
    public static void main(String[] args) {
        //分块查询
        // 1. 原始数组 (18个数据)
        int[] arr = {
                // 第一块 (最大21)
                16, 5, 9, 12, 21, 18,
                // 第二块 (最大45)
                32, 23, 37, 26, 45, 34,
                // 第三块 (最大73)
                50, 48, 61, 52, 73, 66
        };

        // 2. 创建索引表 (Block数组)
        // 这里的索引是我们肉眼数出来的
        Block b1 = new Block(21, 0, 5);   // 第一块最大21，下标0-5
        Block b2 = new Block(45, 6, 11);  // 第二块最大45，下标6-11
        Block b3 = new Block(73, 12, 17); // 第三块最大73，下标12-17

        Block[] blockArr = {b1, b2, b3};

        // 3. 要查找的数字
        int number = 1000;

        // 4. 调用方法
        int index = getIndex(blockArr, arr, number);
        System.out.println("索引为：" + index);
    }

    // ❓ 你的任务在这里
    public static int getIndex(Block[] blockArr, int[] arr, int number) {
        // TODO: 请实现分块查找逻辑
        int maxArrIndex = getMaxArrIndex(blockArr, number);
        if (maxArrIndex == -1) {
            return -1;
        }
        int startIndex = blockArr[maxArrIndex].getStartindex();
        int endIndex = blockArr[maxArrIndex].getEndindex();

        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }

        return -1;
    }

    public static int getMaxArrIndex(Block[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            if (blockArr[i].getMax() >= number) {
                //满足条件则说明number在该块内
                //返回索引
                return i;

            }
        }


        return -1;
    }
}
