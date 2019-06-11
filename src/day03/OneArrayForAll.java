package day03;

import java.util.Scanner;

public class OneArrayForAll {
    public static void main(String[] args) {
        // 声明六个变量， 分别代表六门科目的成绩
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        // 每门课的名字
        String[] names = new String[6];
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiYuIndex] = "外语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";

        Scanner in = new Scanner(System.in);

        System.out.println("需要保存几年的成绩");

        int yearToStore = in.nextInt();

        double[][] scores = new double[yearToStore][names.length]; //申明一个二维数组保存年份和成绩

        // 存入年份和成绩
        for (int i = 0; i < yearToStore; i++) {
            for (int j = 0; j < names.length; j++) {
                scores[i][j] = 80 + (int) Math.random() * 20;
            }
        }

        System.out.println("请输入查看第几年的成绩：");
        int year = in.nextInt() - 1;
        System.out.println("请输入要查看的课程编号：");
        int scorIndex = in.nextInt() - 1;
        System.out.println("您正在查看第" + (year + 1) + "第" + (scorIndex + 1) + "门课程的成绩");
        System.out.println(scores[year][scorIndex]);

    }
}
