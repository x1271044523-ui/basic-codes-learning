package com.xjh.ooptest03;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        Car[] cars = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Car car = new Car();
            System.out.println("请输入汽车品牌：");
            String brand = sc.next();
            System.out.println("请输入汽车价格：");
            int price = sc.nextInt();
            System.out.println("请输入汽车颜色：");
            String color = sc.next();

            car.setBrand(brand);
            car.setPrize(price);
            car.setColor(color);
            cars[i] = car;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(cars[i].getBrand() + " " + cars[i].getPrize() + " " + cars[i].getColor());
        }


    }

}
