package day08.com;

import day08.com.supermarket.LittleSuperMarket;
import day08.com.supermarket.MerchandiseV2;

public class RunLittleSupperMarketAppMain {
    public static void main(String[] args){
        //创建一个小超市
        LittleSuperMarket littleSuperMarket=new LittleSuperMarket();
        littleSuperMarket.address="光谷一路";
        littleSuperMarket.parkingCount=200;
        littleSuperMarket.superMarketName="沃尔超市";
        // 给超市200种商品
        littleSuperMarket.merchandises = new MerchandiseV2[200];
        // 统计用的数组
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];
        // 为了使用方便，创建一个商品数组引用，和littleSuperMarket.merchandises指向同一个数组对象
        MerchandiseV2[] all = littleSuperMarket.merchandises;
        // 遍历并给200种商品赋值
        for (int i = 0; i < all.length; i++) {
            // 创建并给商品的属性赋值
            MerchandiseV2 m = new MerchandiseV2();
            m.name = "商品" + i;
            m.count = 200;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = m.purchasePrice * (1 + Math.random());
            m.id = "ID" + i;
            // 用创建的商品，给商品数组的第i个引用赋值，all和小超市的商品数组引用指向的是同一个数组对象
            all[i] = m;
        }

        System.out.println("下面请利润最高的商品自我介绍：");
        // >> TODO 返回值可以直接使用，不必赋值给一个变量再使用。
        littleSuperMarket.getBiggestProfitMerchandise().describe();
    }
}
