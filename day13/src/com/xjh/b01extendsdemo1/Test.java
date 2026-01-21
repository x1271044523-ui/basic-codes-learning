package com.xjh.b01extendsdemo1;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.eat();
        stu.study();
    }
}

class Person {
    String name;

    Person() {
        System.out.println("父类空参调用....");
    }

    void eat() {
        System.out.println("吃饭");
    }

    void sleep() {
        System.out.println("睡觉");
    }
}

class Student extends Person {

    Student(){
        System.out.println("子类空参调用...");
    }
    @Override
    void eat() {
        System.out.println("吃食堂");
    }

    void study() {
        System.out.println("学习");
    }
}
