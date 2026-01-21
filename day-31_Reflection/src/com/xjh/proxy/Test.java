package com.xjh.proxy;

/**
 * @author Ballauma
 */
public class Test {
    public static void main(String[] args) {

        BigStar star = new BigStar("鸡哥");

        Star proxy = ProxyUtil.createProxy(star);

        proxy.sing("直营你太美");
        proxy.dance();


    }
}
