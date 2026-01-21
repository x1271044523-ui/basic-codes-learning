package com.xjh.easy;

/**
 * @author Ballauma
 */
public class easy2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        //判断回文数
        int ori = x;
        if (x<0){return false;}
        int reverse = 0;
        while (x > 0) {
            int ge = x % 10;
            reverse = ge + reverse * 10;
            x /= 10;
        }
        return ori == reverse;
    }

    public static boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
