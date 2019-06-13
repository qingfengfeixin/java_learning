package day06.com.supermar;

import day06.com.supermar.supermarket.LittleSuperMarket;
import day06.com.supermar.supermarket.Merchandise;
import day06.com.supermar.person.Customer;

import java.util.Scanner;

public class RunLittleSupperMarketAppMain {
    public static void main(String[] args){
        //创建一个小超市类
        LittleSuperMarket LittleSuperMarket=new LittleSuperMarket();
        //赋值
        LittleSuperMarket.supermakername="小超市";
        LittleSuperMarket.address="中山公园";
        LittleSuperMarket.parkingCount=200;
        LittleSuperMarket.merchandises=new Merchandise[200];
        LittleSuperMarket.merchandiseSold=new int[LittleSuperMarket.merchandises.length];

        //使用all指向商品，方便使用
        Merchandise[] all=LittleSuperMarket.merchandises;

        //超市200件商品
        for (int i=0;i<all.length;i++){
            Merchandise m=new Merchandise();
            m.count=200;
            m.id="ID"+i;
            m.name="商品"+i;
            m.purchasePrice=Math.random()*200;
            m.soldPrice=(1+Math.random())*200;
            all[i]=m;
        }
        System.out.println("商品准备完毕！");

        System.out.println("超市开张---------------------------->>");
        boolean open=true;
        Scanner scanner=new Scanner(System.in);
        while (open){
            System.out.println("本店叫做" + LittleSuperMarket.supermakername);
            System.out.println("本店地址" + LittleSuperMarket.address);
            System.out.println("共有停车位" + LittleSuperMarket.parkingCount + "个");
            System.out.println("今天的营业额为" + LittleSuperMarket.incomingSum);
            System.out.println("共有商品" + LittleSuperMarket.merchandises.length + "种");

            Customer customer=new Customer();
            customer.name="顾客编号"+((int)(Math.random()*10000));
            customer.money=(1+Math.random())*2000;
            customer.isDrivingCar=Math.random()>0.5;

            if(customer.isDrivingCar){
                if(LittleSuperMarket.parkingCount>0){
                    System.out.println("请停入车位");
                    LittleSuperMarket.parkingCount--;
                }else{
                    System.out.println("车位已经满了");
                    continue;
                }
            } else{
                System.out.println("绿色出行，欢迎你！");
            }
            double totalCost=0;
            while (true){
                System.out.println("本店提供"+all.length+"商品，欢迎挑选");
                int index=scanner.nextInt();
                if(index<0){
                    break;
                }
                if(index>all.length){
                    System.out.println("非法输入，请重新输入");
                    continue;
                }
                Merchandise m=all[index];
                System.out.println("您选购的商品为"+m.name+"单价为"+m.soldPrice+"需要购买多少个：");
                int buyNumber=scanner.nextInt();
                if(buyNumber<0){
                    System.out.println("取消购买");
                    continue;
                }
                if(buyNumber>m.count){
                    System.out.println("本店没有那么多库存");
                }
                if(buyNumber*m.soldPrice+totalCost>customer.money){
                    System.out.println("没有那么多钱");
                }
                totalCost +=buyNumber*m.soldPrice;
                m.count-=buyNumber;
                LittleSuperMarket.merchandiseSold[index]+=buyNumber;
            }
            customer.money-=totalCost;
            if(customer.isDrivingCar){
                LittleSuperMarket.parkingCount ++;
            }
            System.out.println(customer.name+"共消费了"+totalCost);
            LittleSuperMarket.incomingSum+=totalCost;
            System.out.println("还要继续营业嘛：");
            open=scanner.nextBoolean();

        }
        System.out.println("超市关门");
        System.out.println("今天的营业额为"+LittleSuperMarket.incomingSum);
        for(int i=0;i<LittleSuperMarket.merchandiseSold.length;i++){
            Merchandise m=all[i];
            int numSold =LittleSuperMarket.merchandiseSold[i];
            if(numSold>0){
                double incoming=m.soldPrice*numSold;
                double netIncoming=(m.soldPrice-m.purchasePrice)*numSold;
                System.out.println(m.name+"售出了"+numSold+"净利润为"+netIncoming);
            }
        }

    }
}
