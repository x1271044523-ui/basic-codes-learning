package com.xjh.demo4_udp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author Ballauma
 */
public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入");


        while (true) {
            String str = sc.next();
            if (str.equals("886")){
                break;
            }
            byte[] bytes = str.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("127.0.0.1"),10086);

            ds.send(dp);
        }

        ds.close();
    }
}
