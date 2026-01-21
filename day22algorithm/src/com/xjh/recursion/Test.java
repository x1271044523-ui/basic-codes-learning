package com.xjh.recursion;

public class Test {
    public static void main(String[] args) {
        //利用递归计算1-100的和
        int sum = getSum(100);
        System.out.println(sum);

        System.out.println(getFactorial(5));
    }
    //递归求1-100的和
    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + getSum(num - 1);
    }
    //递归求5阶乘
    public static int getFactorial(int number){
        if (number == 1){
            return 1;
        }
        return number * getFactorial(number-1);

    }
}
