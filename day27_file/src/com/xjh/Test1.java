package com.xjh;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        //删除一个多级文件夹
        File file = new File("D:\\aaa");
        System.out.println(deleteFile(file));


    }

    public static boolean deleteFile(File src) {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    file.delete();
                } else {
                    deleteFile(file);
                }
            }

            return src.delete();
        }
        return false;

    }
}
