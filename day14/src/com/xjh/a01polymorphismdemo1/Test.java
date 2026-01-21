package com.xjh.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {

        Person p = new Person("老王");
        Dog d = new Dog("黑",2);
        Cat c = new Cat("白",3);
        p.keepPet(d,"骨头");
        p.keepPet(c,"鱼");
    }
}
