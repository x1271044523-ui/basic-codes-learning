package com.xjh.a01polymorphismdemo1;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void keepPet(Animal a, String something){


        if (a instanceof Dog d){
            System.out.println("老王喂狗吃骨头");
            d.eat("骨头");
            d.lookHome();

        } else if (a instanceof Cat c) {
            System.out.println("老王喂猫吃鱼");
            c.eat("鱼");
            c.catchMouse();

        }

    }
}
