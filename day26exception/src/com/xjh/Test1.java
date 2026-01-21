package com.xjh;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("请输入年龄,18-40");
            String ageStr = sc.next();
            // 这里如果你输入"abc"，valueOf会抛出 NumberFormatException，也会被下面的catch抓住
            Integer age = Integer.valueOf(ageStr);

            // 📝 优化点1：一旦发现不对，抛出异常时带上具体原因
            if (age < 18 || age > 40) {
                throw new RuntimeException("年龄必须在18-40岁之间！");
            }

            System.out.println("请输入姓名,3-10");
            String name = sc.next();

            // 📝 优化点2：名字不对，也带上具体原因
            if (name.length() < 3 || name.length() > 10) {
                throw new RuntimeException("名字长度必须是3-10个字！");
            }

            System.out.println("录入成功！");

        } catch (Exception e) {
            // 📝 优化点3：不要只打印死板的字，而是打印异常对象里携带的信息
            // e.getMessage() 就会得到你刚才在 throw 括号里写的字符串
            System.out.println("录入失败，原因：" + e.getMessage());

            // 如果你想看红色的详细报错，可以保留 e.printStackTrace();
        }
    }
}