package com.xjh.test;


import cn.hutool.core.io.FileUtil;

/**
 * @author Ballauma
 */
public class Test2 {
    public static void main(String[] args) {

        // 直接告诉它精确坐标，它就不敢乱跑了
        FileUtil.touch("D:\\codes\\basic-codes\\day28_IO\\data\\c.txt");

    }
}
