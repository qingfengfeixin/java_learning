package day09.com.supermarket;

/**
 * 超市
 */

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public MerchandiseV2[] merchandises;
    public int[] merchandiseSold;

    /**
     *
     * @return return商品
     */

    public MerchandiseV2 getBiggestProfitMerchandise() {
        System.out.println("LittleSuperMarket的getBiggestProfitMerchandise方法使用的对象是：" + this);
        MerchandiseV2 curr = null;
        for (int i = 0; i < merchandises.length; i++) {
            MerchandiseV2 m = merchandises[i];
            if (curr == null || curr.calculateProfit() < m.calculateProfit()) {
                curr = m;
            }
        }
        return curr;
    }
}
