package com.xjh.interfacedemo2;

public interface Inter {
    //接口的变量默认有public static final
    public static final String name = "";
    //接口的方法默认有public abstract
    public abstract void method1();

    public default void method2(){
        //接口的默认方法有方法体，不重写不会报错，但是重写就必须去掉default
        System.out.println("默认方法有方法体");
    }

    public static void method3(){
        //接口的静态方法
        System.out.println("具体的代码实现");
    }

    private void method4(){
        //私有方法：把其他方法里面的重复代码抽取出来弄一个方法，对外面没有意义所以用private修饰，外面用不了
    }
    private static void method5(){
        //静态私有方法：和私有方法一样的作用，但是是抽取static方法的
    }

}