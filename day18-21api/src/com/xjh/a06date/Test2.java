package com.xjh.a06date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    //    场景：
//    某购物平台的秒杀活动时间是：2023年11月11日 00:00:00 到 2023年11月11日 00:10:00（只有10分钟）。
//    小贾下单时间：2023年11月11日 0:01:00
//    小皮下单时间：2023年11月11日 0:11:00
//    需求：
//    请写代码判断：这两个人有没有成功参加秒杀活动？
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d1 = sdf1.parse("2023年11月11日 00:00:00");
        Date d2 = sdf1.parse("2023年11月11日 00:10:00");
        Date d3 = sdf1.parse("2023年11月11日 00:01:00");
        Date d4 = sdf1.parse("2023年11月11日 00:11:00");
        long startTime = d1.getTime();
        long endTime = d2.getTime();
        long jiaTime = d3.getTime();
        long piTime = d4.getTime();

        if (jiaTime >= startTime && jiaTime <= endTime){
            System.out.println("小贾成功参与");
        }else {
            System.out.println("小贾参与失败");
        }

        if (piTime >= startTime && piTime <= endTime){
            System.out.println("小皮成功参与");
        }else {
            System.out.println("小皮参与失败");
        }

    }
}
