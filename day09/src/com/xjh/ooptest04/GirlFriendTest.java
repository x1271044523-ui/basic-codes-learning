package com.xjh.ooptest04;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend(" gf1", 18, "女", "旅游");
        GirlFriend gf2 = new GirlFriend(" gf2", 19, "女", "吃饭");
        GirlFriend gf3 = new GirlFriend(" gf2", 22, "女", "睡觉");
        GirlFriend gf4 = new GirlFriend(" gf2", 25, "女", "打豆豆");

        GirlFriend[] gfs = {gf1, gf2, gf3, gf4};
        int sum = 0;
        for (int i = 0; i < gfs.length; i++) {
            sum += gfs[i].getAge();
        }
        System.out.println("平均年龄为：" + sum / gfs.length);
        for (int i = 0; i < gfs.length; i++) {
            if (gfs[i].getAge() < sum / gfs.length) {
                System.out.println(gfs[i].getName()+" "+gfs[i].getAge()+" ");
            }
        }
    }
}

