package com.xjh.a06date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        //假设初恋出生年月日为2000-11-11
        //转化为2000年11月11日

        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf1.parse("2000-11-11");

        SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy年MM月dd日");
        String format = sdf2.format(d1);
        System.out.println(format);
    }
}
