package day07.com.supermarket;

public class MerchandiseV2DescAppMain {
    public static void main(String[] args){
        MerchandiseV2 m=new MerchandiseV2();
        m.name="椅子";
        m.count=10;
        m.id="21212";
        m.madeIn="China";
        m.purchasePrice=500;
        m.soldPrice=922;

        m.describe();

    }
}
