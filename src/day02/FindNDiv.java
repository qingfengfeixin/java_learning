package day02;

public class FindNDiv {
    public static void main(String[] args) {
        int n = 10;
        int dividend = 100;
        int divisor = 1;

        int found = 0;
        while (found < n) {
            if (divisor>20000){
                System.out.println("溢出范围");
                break;
            }
            if (dividend % divisor == 0) {
                found++;
                System.out.println(dividend + "可以整除" + divisor);
            }
            divisor++;
        }

        // do-while
        do {
            System.out.println("不管咋样先执行一次");
        } while (false);   //注意此处需要分号


    }
}
