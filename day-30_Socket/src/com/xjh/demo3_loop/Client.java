package com.xjh.demo3_loop;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.CharsetUtil;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Ballauma
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("::1", 10086);
//        OutputStream os = socket.getOutputStream();
//        OutputStreamWriter osw = new OutputStreamWriter(os);
//        BufferedWriter bw = new BufferedWriter(osw);

        //使用hutool包节省代码
        OutputStreamWriter osw = IoUtil.getWriter(socket.getOutputStream(), CharsetUtil.CHARSET_UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入要说的话：");
            String str = sc.next();

            if ("886".equals(str)) {
                break; // 结束聊天
            }

            // 发送数据
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        socket.close();
    }
}
