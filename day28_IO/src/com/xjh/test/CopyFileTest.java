package com.xjh.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ballauma
 */
public class CopyFileTest {
    public static void main(String[] args) throws IOException {

        File src = new File("D:\\codes\\basic-codes\\day28_IO\\data");
        File path = new File("D:\\codes\\basic-codes\\day28_IO\\myfile");

        copyFile(src, path);
    }

    private static void copyFile(File src, File path) throws IOException {
        //        代码思路：
//        创建目标文件夹：如果 dest 文件夹不存在，先用 mkdirs() 创建它。
//        获取源列表：src.listFiles()。
//        遍历数组：
//        如果是文件：调用 copyFile 方法进行复制。
//        如果是文件夹：递归！ 调用 copyDir(子文件夹, new File(dest, 子文件夹名))。
        path.mkdirs();

        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(path, file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();
            } else {
                copyFile(file, new File(path, file.getName()));
            }
        }
    }
}
