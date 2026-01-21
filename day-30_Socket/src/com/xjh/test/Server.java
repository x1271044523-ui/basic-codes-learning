package com.xjh.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Ballauma
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //PS:写完之后发现用的是字符流，上传图片会出问题，记得以后用字节流上传图片
        //PS2:别忘了客户端要shutdown一下，不然会出问题

        //利用线程池上传文件
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                6,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        ServerSocket ss = new ServerSocket(10086);

        while (true) {
            Socket socket = ss.accept();
            pool.submit(new MySocket(socket));
        }
    }
}
