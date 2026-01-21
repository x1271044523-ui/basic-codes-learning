package com.xjh.a04bigintergerandbigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyBigDecimal {
    public static void main(String[] args) {

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

        BigDecimal add = bd1.add(bd2);
        double v = add.doubleValue();
        System.out.println(add);
        System.out.println(v);

        BigDecimal bd3 = new BigDecimal("10");
        BigDecimal bd4 = new BigDecimal("3");
        //bigdecimal 除法要设置保留几位小数以及四舍五入，否则会报错
        BigDecimal divide = bd3.divide(bd4,2, RoundingMode.HALF_UP);
        System.out.println(divide);


    }
}
