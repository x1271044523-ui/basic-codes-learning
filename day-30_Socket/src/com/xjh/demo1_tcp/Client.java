package com.xjh.demo1_tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author Ballauma
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动，准备发送...");

        Socket socket = new Socket("127.0.0.1", 10086);

        OutputStream os = socket.getOutputStream();

        os.write("hello,server".getBytes(StandardCharsets.UTF_8));

        socket.close();

        System.out.println("客户端发送完毕！");
    }
}
