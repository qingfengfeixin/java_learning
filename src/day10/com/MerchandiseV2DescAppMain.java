package day10.com;

import day10.com.supermarket.LittleSuperMarket;
import day10.com.supermarket.MerchandiseV2;

public class MerchandiseV2DescAppMain {
    public static void main(String[] args){
        // 创建一个小超市类
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.init("有家小超市", "浦东新区世纪大道666号",
                100, 200, 200);
        System.out.println("下面请利润最高的商品自我介绍：");
        littleSuperMarket.getBiggestProfitMerchandise().describe();

        MerchandiseV2 merchandise = new MerchandiseV2();

        merchandise.init("书桌", "DESK9527", 40, 999.9, 500);

        // >> TODO 理解为什么返回值不是方法签名的一部分：不能帮助确定调用哪个方法。
        merchandise.buy();
        merchandise.describe();

        double cost = merchandise.buy(10);
        System.out.println(cost);
        merchandise.describe();

        double costVIP = merchandise.buy(10, true);
        System.out.println(costVIP);
        merchandise.describe();

        // >> TODO 依次使用byte, short, int, long, float, double 类型的参数调用buy方法，哪个方法会被调用呢？
        // >> TODO 无论是否重载参数类型可以不完全匹配的规则是"实参数可以自动类型转换成形参类型"
        // >> TODO 重载的特殊之处是，参数满足自动自动类型转换的方法有好几个，重载的规则是选择最"近"的去调用

    }
}
