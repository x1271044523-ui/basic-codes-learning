package com.xjh.a03myobject;

public class clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        //浅克隆
        //深克隆用第三方工具类 Gson
        // 1. 创建本体：data 数组是 {10, 20}
        int[] arr = {10, 20};
        User u1 = new User(18, arr);

        // 2. 克隆出 u2
        User u2 = (User) u1.clone();

        // 3. 修改 u2 的数据
        u2.age = 99;          // 改基本类型
        u2.data[0] = 888;     // 改引用类型里的值

        // 4. 打印本体 u1
        System.out.println("本体 age: " + u1.age);       // 18 (没变，安全)
        System.out.println("本体 data[0]: " + u1.data[0]); // 😱 888 (变了！被 u2 改了！)
    }
}
