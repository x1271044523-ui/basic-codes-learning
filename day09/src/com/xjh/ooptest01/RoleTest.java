package com.xjh.ooptest01;

public class RoleTest {
    public static void main(String[] args) {
        Role r1 = new Role("张三", 100, "男", null);
        Role r2 = new Role("李四", 100, "女", null);

        System.out.println(r1.getFace());
        System.out.println(r2.getFace());

        while (true) {
            r1.attack(r2);
            if (r2.getBlood() <= 0) {
                System.out.println(r2.getName() + "死亡了");
                break;
            }

            r2.attack(r1);
            if (r1.getBlood() <= 0) {
                System.out.println(r1.getName() + "死亡了");
                break;
            }
        }
    }
}
