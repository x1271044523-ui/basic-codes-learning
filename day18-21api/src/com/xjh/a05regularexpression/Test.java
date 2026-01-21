package com.xjh.a05regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        //正则表达式
        //爬虫
        String str = "String data = \"欢迎来到Java极客训练营！\\n\" +\n" +
                "        \"这里有资深讲师张三，手机：13812345678，备用机：18699998888；\\n\" +\n" +
                "        \"座机热线请拨打：010-56781234 或者 021-88889999。\\n\" +\n" +
                "        \"有任何问题请发邮件至：admin@163.com，或者 vip_support@google.com.cn。\\n\" +\n" +
                "        \"点击链接领取资料：<a href='http://www.itcast.cn'>点我跳转</a>\\n\" +\n" +
                "        \"我的微信号是：Java_2025 (注意不是手机号)。\";";

        Pattern p1 = Pattern.compile("1[3-9]\\d{9}");
        Pattern p2 = Pattern.compile("\\d{3}-\\d{8}");
        Pattern p3 = Pattern.compile("(([^<>()\\.,;:\\s@\"]+(\\.[^<>()\\.,;:\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))");

        Matcher m1 = p1.matcher(str);
        Matcher m2 = p2.matcher(str);
        Matcher m3 = p3.matcher(str);

        while (m1.find()){
            String group = m1.group();
            System.out.println(group);
        }
        while (m2.find()){
            String group = m2.group();
            System.out.println(group);
        }
        while (m3.find()){
            String group = m3.group();
            System.out.println(group);
        }
    }
}
