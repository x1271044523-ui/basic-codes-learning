package com.xjh.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Ballauma
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day28_IO\\data\\userinfo"));

        String len;
        String username ="";
        String password ="";
        while ((len = br.readLine()) != null) {
            String[] stringArr = len.split("&");
            username = stringArr[0].split("=")[1];
            password = stringArr[1].split("=")[1];
        }
        br.close();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String uname = sc.next();
        System.out.println("请输入密码");
        String pwd = sc.next();

        if (uname.equals(username)  && password.equals(pwd)) {
            System.out.println("登陆成功");
        }
    }
}
