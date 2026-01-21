package com.xjh.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //用代码实现计算活了多少天
        //jdk7
        Date d1 = new Date();
        long time1 = d1.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d2 = sdf.parse("2004-09-26");
        long time2 = d2.getTime();

        long day = (time1 - time2) / 1000 / 60 / 60 / 24;
        System.out.println(day);

        //jdk8
        LocalDate birthday = LocalDate.of(2004, 9, 26);
        LocalDate now = LocalDate.now();

        long between = ChronoUnit.DAYS.between(birthday, now);

        System.out.println(birthday);
        System.out.println(now);
        System.out.println(between);


    }
}
