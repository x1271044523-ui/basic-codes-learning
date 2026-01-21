package com.xjh.ooptest03;

public class Car {
    private String brand;
    private double prize;
    private String color;

    public Car() {
    }

    public Car(String brand, double prize, String color) {
        this.brand = brand;
        this.prize = prize;
        this.color = color;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return prize
     */
    public double getPrize() {
        return prize;
    }

    /**
     * 设置
     * @param prize
     */
    public void setPrize(double prize) {
        this.prize = prize;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }


}
