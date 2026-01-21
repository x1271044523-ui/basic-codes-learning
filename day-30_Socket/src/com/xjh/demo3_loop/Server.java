package com.xjh.demo3_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Ballauma
 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动中");
        ServerSocket ss = new ServerSocket(10086);

        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);


        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }

        br.close();
        socket.close();
        ss.close();
        System.out.println("服务器已关闭");
    }
}
