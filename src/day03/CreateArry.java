package day03;

import javax.sound.midi.Soundbank;

public class CreateArry {
    public static void main(String[] args) {
        int[] myIntArray = new int[88];
        System.out.println(myIntArray[2]);   //下表从0开始,都有初始值
        System.out.println(myIntArray.length);  //数组长度固定

        int YuWen = 0;
        int ShuXue = 1;
        int WaiYu = 2;
        int WuLi = 3;
        int HuaXue = 4;
        int ShengWu = 5;

        int totalScoreCount = 6;
        double[] scores = new double[totalScoreCount];
        String[] scoreNames = new String[totalScoreCount];

        scoreNames[YuWen] = "语文";
        scoreNames[ShuXue] = "数学";
        scoreNames[WaiYu] = "外语";
        scoreNames[WuLi] = "物理";
        scoreNames[HuaXue] = "化学";
        scoreNames[ShengWu] = "生物";

        for (int i = 0; i < totalScoreCount; i++) {
            scores[i] = 80 + (int) (Math.random() * 20);
            System.out.println(scoreNames[i] + ">>>" + scores[i]);
        }
        double MaxScore = 0;
        int maxScoreIndex = -1;

        for (int i = 0; i < totalScoreCount; i++) {
            if (scores[i] > MaxScore) {
                MaxScore = scores[i];
                maxScoreIndex = i;
            }
        }
        System.out.println(maxScoreIndex + ">>>" + MaxScore);
    }
}
