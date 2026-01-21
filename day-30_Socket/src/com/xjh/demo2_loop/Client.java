package com.xjh.demo2_loop;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Ballauma
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086);
        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入要说的话：");
            String str = sc.next();

            if ("886".equals(str)) {
                break; // 结束聊天
            }

            // 发送数据
            os.write(str.getBytes());
        }

        socket.close();
        os.close();
    }
}
