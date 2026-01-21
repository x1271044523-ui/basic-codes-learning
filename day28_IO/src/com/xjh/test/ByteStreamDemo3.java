package com.xjh.test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //字节流读取汉字输出报错，因为汉字一个占3字节
        FileInputStream fis = new FileInputStream("day28_IO\\data\\chinese.txt");

        int len1;
        while ((len1 = fis.read()) !=-1){
            System.out.print((char)len1);
            /*
            * ä½ å¥½ä¸ç
            * */
        }
        fis.close();

        //字符流输入汉字 自动拼接3字节
        FileReader fr = new FileReader("day28_IO\\data\\chinese.txt");

        int len2;
        while ((len2 = fr.read()) !=-1){
            System.out.println((char)len2);
        }
        fr.close();
    }
}
