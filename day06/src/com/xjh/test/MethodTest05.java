package com.xjh.test;

/**
 * MethodTest05类
 * 用于演示数组部分复制功能的测试类
 * @author xjh
 */
public class MethodTest05 {
    /**
     * 主方法，程序的入口点
     * 用于测试copyOfRange方法的功能
     * @param args 命令行参数，此处未使用
     */
    public static void main(String[] args) {
        // 定义一个源数组
        int[] arr = {1, 2, 3, 4, 5};
        // 调用copyOfRange方法复制数组的指定范围[1,3)，即索引1和2的元素
        int[] arr2 = copyOfRange(arr, 1, 3);

        // 遍历并打印复制后的数组元素
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
    
    /**
     * 复制数组中指定范围的元素
     * @param arr 源数组
     * @param from 起始索引（包含）
     * @param to 结束索引（不包含）
     * @return 包含指定范围元素的新数组
     * @注意：当前实现存在bug，应该是arr2[i] = arr[from + i]，而不是arr2[i] = arr[i]
     */
    public static int[] copyOfRange(int[] arr, int from, int to){
        // 计算需要复制的元素个数
        int len = to - from;
        // 创建新数组用于存储复制的元素
        int[] arr2 = new int[len];

        // 遍历源数组，将指定范围的元素复制到新数组
        for (int i = 0; i < len; i++) {
            arr2[i] = arr[from + i]; // 这里有bug，应该是arr[from + i]
        }

        // 返回新数组
        return arr2;
    }
}