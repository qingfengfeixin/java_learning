package day02;

public class RandomNunber {
    public static void main(String[] args) {
        double randowmNum = 0;

        while (randowmNum < 0.5) {
            randowmNum = Math.random();   //生成一个0-1的double随机数
            System.out.println(randowmNum);
        }
        /* 生成一个区间的随机整数*/
        int rangeStart = 30;
        int rangeEnd = 90;

        int mod = rangeEnd - rangeStart;

        int bigRandom = (int) (Math.random() * rangeEnd * 100);  //强制类型转换优先级最高
        int numberToGuess=(bigRandom % mod)+rangeStart;
        System.out.println("mod "+mod+" bigNumber"+bigRandom);
        System.out.println(numberToGuess);

    }
}
