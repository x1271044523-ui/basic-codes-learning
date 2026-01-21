package com.xjh.test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * @author Ballauma
 */
public class InputStreamReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //jdk8
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day28_IO\\data\\gbk.txt"),"GBK");
        int len;
        while((len = isr.read())!=-1){
            System.out.print((char)len);
        }
        System.out.println();
        isr.close();

        //jdk11的新方法
        FileReader fr = new FileReader("day28_IO\\data\\gbk.txt", Charset.forName("GBK"));
        int len2;
        while((len2 = fr.read())!=-1){
            System.out.print((char)len2);
        }
        fr.close();
    }
}
