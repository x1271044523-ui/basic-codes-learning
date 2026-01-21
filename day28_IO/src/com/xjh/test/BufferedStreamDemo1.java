package com.xjh.test;

import java.io.*;

/**
 * @author Ballauma
 */
public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day28_IO\\data\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day28_IO\\data\\b.txt"));

        int len;
        byte[] bytes = new byte[1024];
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();

    }
}
