package com.xjh.test;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();

        User user2 = new User();
        user2.setUserName("张三");
        user2.setPassword(123456);
        user2.setEmail("123@qq.com");
        user2.setGender("男");
        user2.setAge(18);
        System.out.println(user2.getUserName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getEmail());
        System.out.println(user2.getGender());
        System.out.println(user2.getAge());
        System.out.println(user1.getUserName());
        System.out.println(user1.getPassword());
        System.out.println(user1.getEmail());
        System.out.println(user1.getGender());
        System.out.println(user1.getAge());
    }

}
