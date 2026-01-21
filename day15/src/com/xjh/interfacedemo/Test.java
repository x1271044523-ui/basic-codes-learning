package com.xjh.interfacedemo;

public class Test {
    public static void main(String[] args) {

        Dog d = new Dog("a",1);
        Frog f = new Frog("a",1);
        Rabbit r = new Rabbit("a",1);
        d.eat();
        d.swim();
        f.eat();
        f.swim();
        r.eat();
    }
}
