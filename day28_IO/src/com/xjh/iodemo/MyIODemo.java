package com.xjh.iodemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class MyIODemo {
    public static void main(String[] args) throws IOException {
        // 路径：模块名/文件夹名/文件名
        FileOutputStream fos = new FileOutputStream("day28_IO\\data\\a.txt");

        fos.write(97);
        fos.close();
    }
}
