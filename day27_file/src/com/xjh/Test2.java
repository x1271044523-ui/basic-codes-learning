package com.xjh;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("E:\\");
        HashMap<String, Integer> hm = new HashMap<>();

        // main方法里不需要 try-catch 了，逻辑在里面处理
        getFileCount(file, hm);

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry);
        }
    }

    public static void getFileCount(File file, HashMap<String, Integer> hm) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isFile()) {
                    // 1. 先只获取文件名，防止路径里的点干扰
                    String name = file1.getName();
                    String[] arr = name.split("\\.");

                    // 2. 只有当切出来的部分大于1个，才说明有后缀
                    // (防止 hosts 这种文件报错)
                    if (arr.length > 1) {
                        // 3. 取数组的【最后一个】，这才是真正的后缀
                        String suffix = arr[arr.length - 1];

                        // 4. 统计逻辑
                        if (hm.containsKey(suffix)) {
                            hm.put(suffix, hm.get(suffix) + 1);
                        } else {
                            hm.put(suffix, 1);
                        }
                    }
                } else {
                    // 递归文件夹
                    getFileCount(file1, hm);
                }
            }
        }
    }
}