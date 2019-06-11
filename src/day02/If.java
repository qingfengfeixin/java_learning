package day02;

public class If {
    public static void main(String[] args){
        int a = 4;
        int b = 5;
        int c = 2;
//比较abc的大小
        if (a == b && b == c){
            System.out.println("a、b、c一样大");
        }else{if (a > b){
            if (b > c){
                System.out.println("a>b>c");
            }else{
                if (a > c) {
                    System.out.println("a>c>b");
                }else{
                    System.out.println("c>a>b");
                }
            }
        }else{if (a>c){
            System.out.println("b>a>c");
        }else{System.out.println("sth");}
        }
        }
// 取abc最大值
        if (a == b && b == c){
            System.out.println("abc一样的大小");
        }else if (a > b && a >c ){
            System.out.println("a最大");
        }else if (b > a && b > c ){
            System.out.println("b最大");
        }else if ( c > a && c > b ){
            System.out.println("c最大");
        }else if (a == b && a > c){
            System.out.println("最大值为a、b");
        }else if ( b == c && b > a){
            System.out.println("最大值为b、c");
        }else if ( a == c && a > b ){
            System.out.println("最大值为a、c");
        }
    }
}
