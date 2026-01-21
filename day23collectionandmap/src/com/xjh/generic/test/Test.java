package com.xjh.generic.test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        bosi bosi = new bosi();
        lihua lihua = new lihua();
        taidi taidi = new taidi();
        hashiqi hsq = new hashiqi();

        ArrayList<Animal> list = new ArrayList<>();
        list.add(bosi);
        list.add(lihua);
        list.add(taidi);
        list.add(hsq);

        keepPet(list);

    }
    public static void keepPet(ArrayList<? extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
