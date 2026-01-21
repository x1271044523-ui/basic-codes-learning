package com.xjh.test;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //在 data 文件夹下新建一个 poem.txt，并写入两句诗（分两行，且要使用追加模式）。
        FileOutputStream fos = new FileOutputStream("day28_IO\\data\\a.txt", true);

        String str1 = "两只黄鹂鸣翠柳";
        String str2 = "一行白鹭上青天";
        String wrap = "\r\n";

        byte[] bytes1 = str1.getBytes();
        byte[] bytes2 = str2.getBytes();
        byte[] bytes3 = wrap.getBytes();

        fos.write(bytes1);
        fos.write(bytes3);
        fos.write(bytes2);
        fos.close();
    }
}
