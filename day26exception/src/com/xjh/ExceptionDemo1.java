package com.xjh;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("----- 游戏开始 -----");

        try {
            // 1. 这种可能出问题的代码，放到 try 里面
            System.out.println(10 / 0);
            System.out.println("这行代码不会执行，因为上面炸了");

        } catch (ArithmeticException e) {
            // 2. 一旦 try 里面炸了，JVM 会生成一个异常对象
            // 并被这里的 e 抓住！
            System.out.println("🚑 出事了！算术异常：不能除以0！");
        }

        // 3. 关键点：防弹衣生效，程序继续往下走
        System.out.println("----- 游戏结束 -----");


    }
}
