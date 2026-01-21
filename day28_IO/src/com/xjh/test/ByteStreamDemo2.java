package com.xjh.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\steam\\steamapps\\workshop\\content\\431960\\1661377897\\EP07.mp4");
        FileOutputStream fos = new FileOutputStream("day28_IO\\data\\copy.mp4");

        byte[] bytes = new byte[1024*1024];
        int len;//len表示一次read拷贝了多少次
        while ((len = fis.read(bytes)) != -1){
//            fos.write(read); 太慢
            //用数组装，快
            //0表示从0索引开始，到len结束
            fos.write(bytes,0,len);

        }
        fos.close();
        fis.close();

    }
}
