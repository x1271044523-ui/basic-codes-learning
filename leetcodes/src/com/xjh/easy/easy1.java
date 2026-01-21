package com.xjh.easy;

import java.util.HashMap;

public class easy1 {
    public static void main(String[] args) {
        /*
        *   给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

            你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。

            你可以按任意顺序返回答案。
        * */
        int[] nums = {2, 7, 11, 15};
        int target = 9;
    }

    //提示：用 Map 存 {数值: 下标}，遍历的时候回头看 Map 里有没有想要的那个数。
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int needNum = target - currentNum;
            if (hm.containsKey(needNum)) {
                return new int[]{i, hm.get(needNum)};
            } else {
                hm.put(currentNum,i);
            }
        }
        return null;
    }
}
