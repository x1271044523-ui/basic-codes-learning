package com.xjh.b02extendsdemo2;

public class Test {
    public static void main(String[] args) {
        manager manager = new manager();

        chef chef = new chef();

        manager.work();
        chef.work();
    }

}

class employee {
    private String id;
    private String name;
    private int price;

    public void work() {
        System.out.println("工作");
    }

    public void eat() {
        System.out.println("吃米饭");
    }
}

class manager extends employee {
    private int managePrice;

    @Override
    public void work() {
        System.out.println("管理其他人");
    }

}

class chef extends employee {

    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
