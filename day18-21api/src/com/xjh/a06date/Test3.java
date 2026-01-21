package com.xjh.a06date;


import java.time.LocalDateTime;

public class Test3 {
    public static void main(String[] args) {
        // 1. 用 .of() 方法设定 活动开始 和 结束时间
        LocalDateTime start = LocalDateTime.of(2023, 11, 11, 0, 0, 0);
        LocalDateTime end = LocalDateTime.of(2023, 11, 11, 0, 10, 0);

        // 2. 用 .of() 方法设定 小贾 和 小皮 的下单时间
        LocalDateTime jia = LocalDateTime.of(2023, 11, 11, 0, 1, 0);
        LocalDateTime pi = LocalDateTime.of(2023, 11, 11, 0, 11, 0);

        // 3. 判断 (不需要转毫秒值！)
        // 逻辑：小贾在开始之后(isAfter) 或等于(isEqual)，并且在结束之前(isBefore) 或等于
        // JDK8 稍微有点麻烦的是包含边界比较，通常 isAfter 不包含等于。
        if (jia.isAfter(start)&&jia.isBefore(end)){
            System.out.println("参加成功");
        }
        if (pi.isAfter(start)&&pi.isBefore(end)){
            System.out.println("参加成功");
        }
    }
}

