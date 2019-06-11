package day02;

public class SimpleFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        char ch = 'A';
        int startnumber = ch;   //强转成数字

        System.out.println(startnumber);

        for (int i = 0; i < 26; i++) {
            System.out.println((startnumber + i) + "\t" + (char) (startnumber + i));
        }

        int divided = 100;
        int divisor = 3;
        int found = 0;

        for (int i = 0;i < 100 && found < 10;i++ , divisor ++ ){
            if(divisor == 5){
                System.out.println("continue>>>" + divisor);
                continue;
            }
            if(divided % divisor == 0){
                System.out.printf(divided + "可以整除" + divisor + '\n');
                found ++ ;
            }
            if (divisor == 33){
                System.out.println("break >>>" + divisor);
                break;
            }
        }
    }
}
