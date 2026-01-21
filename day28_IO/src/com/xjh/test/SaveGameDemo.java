package com.xjh.test;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ObjectUtil;

/**
 * @author Ballauma
 */
public class SaveGameDemo {
    public static void main(String[] args) {
        //拼图游戏没做完，用这个代替一下
        int[][] arrArr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,0}
        };
        FileUtil.writeBytes(ObjectUtil.serialize(arrArr),"D:\\codes\\basic-codes\\day28_IO\\data\\save.txt");

        byte[] bytes = FileUtil.readBytes("D:\\codes\\basic-codes\\day28_IO\\data\\save.txt");
        int[][] deserialize = ObjectUtil.deserialize(bytes);
        for (int i = 0; i < deserialize.length; i++) {
            for (int i1 = 0; i1 < deserialize[i].length; i1++) {
                System.out.println(deserialize[i][i1]);
            }
        }
    }
}
