package com.xjh.test;

import java.io.*;
import java.net.Socket;

/**
 * @author Ballauma
 */
public class MySocket implements Runnable {
    Socket socket;
    public MySocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("day-30_Socket\\src\\serverdata\\a.png")));

            int b;
            while ((b = br.read()) != -1) {
                bw.write(b);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
