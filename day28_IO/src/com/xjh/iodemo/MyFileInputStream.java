package com.xjh.iodemo;

import java.io.FileInputStream;
import java.io.IOException;

public class MyFileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day28_IO\\data\\b.txt");

        int read;
        while ((read = fis.read()) != -1) {
            System.out.println((char) read);
        }
        fis.close();


    }
}
