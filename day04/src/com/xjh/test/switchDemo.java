package com.xjh.test;

public class switchDemo {
    public static void main(String[] args) {
        //JDK12开始，switch语句支持表达式，每个case后面可以直接跟一个值，不需要再跟一个冒号
        //箭头后面只有一条语句时，可以省略大括号
        int a = 1;
        switch(a){
            case 1->System.out.println("1");
            case 2->System.out.println("2");
            case 3->System.out.println("3");
            default -> System.out.println("default");
        }
    }
}
