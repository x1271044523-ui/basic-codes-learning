package com.xjh.demo4_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author Ballauma
 */
public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true) {
            // 3. 接收 (阻塞方法，没包来就卡着)
            ds.receive(dp);

            // 4. 拆包
            // getData(): 拿到数据
            // getLength(): 拿到实际发了多少个字节 (避免打印出后面的空格垃圾)
            String msg = new String(dp.getData(), 0, dp.getLength());

            // 还可以看看是谁发的
            String ip = dp.getAddress().getHostAddress();

            System.out.println("收到来自 " + ip + " 的消息：" + msg);
        }
    }

}

