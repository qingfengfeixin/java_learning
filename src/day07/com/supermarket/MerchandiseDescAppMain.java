package day07.com.supermarket;

public class MerchandiseDescAppMain {
    public static void main(String[] args) {
        Merchandise m = new Merchandise();

        m.name = "书桌";
        m.soldPrice = 99.9;
        m.purchasePrice = 500;
        m.count = 40;
        m.id = "DESK9527";

        System.out.println("商品"+m.name);


    }
}
