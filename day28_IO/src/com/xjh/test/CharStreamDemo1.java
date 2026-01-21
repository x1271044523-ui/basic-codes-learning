package com.xjh.test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ballauma
 */
public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day28_IO\\data\\chinese.txt");

        try(fw) {
            fw.write("你好世界啊");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
