package com.xjh.demo1_tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Ballauma
 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动，等待连接...");

        // 1. 创建 ServerSocket (相当于安装座机)
        // 这里的端口必须和客户端一致！
        ServerSocket ss = new ServerSocket(10086);

        // 2. 等待连接 (阻塞方法)
        // 程序会卡在这里，直到有人连上来
        // 一旦连上，返回一个 Socket 对象 (这就是连接通道)
        Socket socket = ss.accept();

        System.out.println("有人连上来了！");

        // 3. 获取输入流 (准备听)
        InputStream is = socket.getInputStream();

        // 4. 读取数据 (IO 流老操作)
        // 这里的 socket 和客户端的 socket 是连通的，那边 write，这边就能 read
        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
            // 强转打印（注意中文可能会乱码，先试试英文或者忍受乱码）
        }

        // 5. 挂断
        socket.close();
        ss.close();
    }
}
