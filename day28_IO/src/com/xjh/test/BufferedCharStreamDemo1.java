package com.xjh.test;

import java.io.*;

/**
 * @author Ballauma
 */
public class BufferedCharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //字符缓冲流的续写开关不在字符缓冲流里，而是再字符缓冲流的参数 也就是普通字符流里
        BufferedReader br = new BufferedReader(new FileReader("day28_IO\\data\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day28_IO\\data\\b.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            System.out.println(line);
        }
        bw.close();
        br.close();
    }
}
