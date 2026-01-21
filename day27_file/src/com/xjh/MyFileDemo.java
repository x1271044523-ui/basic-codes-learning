package com.xjh;

import java.io.File;

public class MyFileDemo {
    public static void main(String[] args) {
//        file的两种常见构造，传入字符串或者拼接父级路径+子级路径
        String str = "D:\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        String parent = "D:\\";
        String child = "a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);


        System.out.println(f2.isFile());//判断文件是否是文件
        System.out.println(f2.isDirectory());//判断文件是否是文件夹
        System.out.println(f2.exists());//判断是否存在该文件/文件夹

        /*
        *      f2.mkdirs();
               f2.createNewFile();
               会根据是否存在该文件/文件夹来创建对应的文件夹
        *
        * */

        //遍历方式 listFiles() 看不到隐藏文件夹和需要权限的文件夹
        File f3 = new File("D:\\aaa");
        File[] files = f3.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
        }
    }
}
