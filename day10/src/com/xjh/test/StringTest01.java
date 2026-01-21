package com.xjh.test;

import java.util.Scanner;

public class StringTest01 {
    //已知正确的用户名和密码，请用程序模拟用户登录
    //总共给三次机会，登陆成功给出提示
    public static void main(String[] args) {
        String userName = "admin";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        boolean isLoginSuccess = false;

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String userInput = sc.next();
            System.out.println("请输入密码：");
            String pwdInput = sc.next();
            if (userName.equals(userInput) && password.equals(pwdInput)) {
                isLoginSuccess = true;
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("用户名或密码错误,请重新输入，你还剩" + (2 - i) + "次机会");
            }
        }
        if (!isLoginSuccess) {
            System.out.println("3次机会用完，登录失败,请联系管理员");
        }
    }
}
