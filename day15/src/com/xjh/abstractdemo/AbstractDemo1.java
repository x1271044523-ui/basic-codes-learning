package com.xjh.abstractdemo;

public class AbstractDemo1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }


}

abstract class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
}

class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃饭");
    }

}
