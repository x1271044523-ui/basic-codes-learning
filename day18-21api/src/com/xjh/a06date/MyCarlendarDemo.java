package com.xjh.a06date;

import java.util.Calendar;

public class MyCarlendarDemo {
    public static void main(String[] args) {
        // 1. 获取日历对象 (当前时间)
        Calendar c = Calendar.getInstance();

        // 2. 获取年、月、日
        int year = c.get(Calendar.YEAR);

        // ⚠️ 坑：月份要 +1 才是真实月份
        int month = c.get(Calendar.MONTH) + 1;

        int day = c.get(Calendar.DAY_OF_MONTH);

        // 3. 获取星期
        // ⚠️ 坑：1是周日，2是周一...
        int week = c.get(Calendar.DAY_OF_WEEK);

        System.out.println(year + "年" + month + "月" + day + "日");
        System.out.println("星期数字：" + week);
    }
}
