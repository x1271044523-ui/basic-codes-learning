package com.xjh.a06date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateDemo {
    public static void main(String[] args) {
        //时间date 传入long类型 从1970年开始
        Date d1 = new Date(0L);
        System.out.println(d1);

        //SimpleDateFormat 将date对象的时间转换成传入参数的格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String format = sdf1.format(d1);
        System.out.println(format);
    }
}
