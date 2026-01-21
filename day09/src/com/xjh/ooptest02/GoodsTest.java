package com.xjh.ooptest02;

public class GoodsTest {
    public static void main(String[] args) {
        Goods g1 = new Goods(1,"华为手机",5999.99,100);
        Goods g2 = new Goods(2,"苹果手机",6999.99,200);
        Goods g3 = new Goods(3,"小米手机",1999.99,300);



        Goods[] goodsArr = {g1,g2,g3};
        for (int i = 0; i < goodsArr.length; i++) {
            System.out.println(goodsArr[i].getId()+goodsArr[i].getName()+goodsArr[i].getPrice()+goodsArr[i].getCount());
        }
    }
}
