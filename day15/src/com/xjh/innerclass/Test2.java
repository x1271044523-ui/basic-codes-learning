package com.xjh.innerclass;

// 1. 接口
interface Swim {
    void swimming();
}

// 2. 测试类
public class Test2 {
    public static void main(String[] args) {
        // ❓ 你的任务在这里

        goSwimming(


                new Swim() {

                    @Override
                    public void swimming() {
                        System.out.println("匿名内部类在游泳");
                    }
                }

        );


    }

    // 一个想要接收 Swim 接口的方法
    public static void goSwimming(Swim s) {
        s.swimming();
    }
}
