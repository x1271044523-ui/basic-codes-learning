package com.xjh.a04bigintergerandbigdecimal;

import java.math.BigInteger;

public class MyBigInteger {
    public static void main(String[] args) {
        BigInteger bg1 = new BigInteger("100");
        BigInteger bg2 = new BigInteger("200");

        BigInteger addNum = bg1.add(bg2);
        int i = addNum.intValue();
        System.out.println(addNum);
        System.out.println(i);
    }
}
