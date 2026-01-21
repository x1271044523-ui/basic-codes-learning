package com.xjh.interfacedemo;

public class Frog extends Animal implements swim{
    public Frog(){

    }
    public Frog(String name , int age){
        super(name,age);
    }
    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    public String toString() {
        return "Frog{}";
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}
