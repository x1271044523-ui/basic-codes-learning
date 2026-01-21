package com.xjh.test;

import java.io.*;
import java.net.Socket;

/**
 * @author Ballauma
 */
public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 10086);

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("day-30_Socket\\src\\data\\QQ浏览器截图20260113101547.png")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));


        int b;
        while ((b = br.read()) != -1) {
            bw.write(b);
        }
        socket.shutdownOutput();
        socket.close();
    }
}
