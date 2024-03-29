package day08.com;

import day08.com.supermarket.LittleSuperMarket;
import day08.com.supermarket.MerchandiseV2;

import java.util.Scanner;

public class RunLittleSupperMarketAppMainV2 {
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

        Scanner scanner=new Scanner(System.in);
        MerchandiseV2 m0= all[0];
        while (true){
            System.out.println("超市特惠，第二件半价！");
            int index =scanner.nextInt();
            if(index<0){
                System.out.println("欢迎下次光临！");
                break;
            }
            System.out.println("请输入购买数量:");
            int count =scanner.nextInt();
            MerchandiseV2 m=littleSuperMarket.merchandises[index];
            System.out.println("用户选择的商品是超市里价值最高的"+m.isTheBiggestTotalValueOne(littleSuperMarket));
            double totalCost = m.buyAndPrintLeft(count, true);

            boolean m0BiggerThan = m0.totalValueBiggerThan(m);
            System.out.println("m0的总价值比用户选择的要大：" + m0BiggerThan);

            System.out.println("商品总价为：" + totalCost);
        }
    }
}
