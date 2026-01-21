package com.xjh.test;

public class Test01 {
    public static void main(String[] args) {
        price(1000, 11, 2);

    }

    public static void price(int price, int month, int level) {
        switch (month) {
            case 5, 6, 7, 8, 9, 10:
                if (level == 1) {
                    System.out.println("5-10月头等舱价格为：" + price * 0.9);
                } else if (level == 2) {
                    System.out.println("5-10月经济舱价格为：" + price * 0.85);
                } else {
                    System.out.println("输入的等级有误");
                }
                break;
            case 11, 12, 1, 2, 3, 4:
                if (level == 1) {
                    System.out.println("11-4月头等舱价格为：" + price * 0.7);
                } else if (level == 2) {
                    System.out.println("11-4月经济舱价格为：" + price * 0.65);
                } else {
                    System.out.println("输入的等级有误");
                }
                break;
        }
    }
}
