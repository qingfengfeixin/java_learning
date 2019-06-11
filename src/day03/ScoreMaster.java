package day03;

import java.util.Scanner;

public class ScoreMaster {
    public static void main(String[] args) {
        // 声明六个变量， 分别代表六门科目的成绩,相当于课程编号
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        // 每门课的名字
        int totalCourseCnt = 6;
        String[] names = new String[totalCourseCnt];
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiYuIndex] = "外语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";

        Scanner in = new Scanner(System.in);
        System.out.println("需要保存几年的成绩");
        int yearToStore = in.nextInt();

        double[][] scores = new double[yearToStore][totalCourseCnt]; //申明一个二维数组保存年份和成绩

        // 存入年份和成绩
        for (int i = 0; i < yearToStore; i++) {
            for (int j = 0; j < totalCourseCnt; j++) {
                scores[i][j] = 80 + Math.random() * 20;
                System.out.println("第" + (i + 1) + "年，第" + (j + 1) + "门课程的成绩是：" + scores[i][j]);
            }
        }

        // 开始
        boolean exitFlag = true;
        while (exitFlag) {
            System.out.println("请选择要进行的操作");
            System.out.println("1：求某一年最好的成绩\n" +
                    "2:求某年的平均成绩\n" +
                    "3:求所有年份最好的成绩\n" +
                    "4:求某门课历年最好的成绩"
            );
            int option = in.nextInt();
            int year = 0; //在case外面定义一个变量，因为case中无法重复定义变量
            switch (option) {
                case 1:
                    System.out.println("请输入年份:");
                    year = in.nextInt();
                    if (year <= 0 || year > yearToStore) {
                        System.out.println("非法输入" + year);
                        exitFlag = false;
                        break;
                    }
                    year -= 1;
                    int bestScoreIndexOfYear = 0;
                    for (int i = 0; i < totalCourseCnt; i++) {
                        if (scores[year][i] > scores[year][bestScoreIndexOfYear]) {
                            bestScoreIndexOfYear = i;
                        }
                    }
                    System.out.println("the best score of " + (year + 1) + " year is " + scores[year][bestScoreIndexOfYear]);
                    break;
                case 2:
                    System.out.println("请输入年份:");
                    year = in.nextInt();
                    if (year <= 0 || year > yearToStore) {
                        System.out.println("非法输入" + year);
                        exitFlag = false;
                        break;
                    }
                    year -= 1;
                    double scoreAvg = 0;
                    for (int i = 0; i < totalCourseCnt; i++) {
                        scoreAvg += scores[year][i];
                    }
                    System.out.println("the average score of " + (year + 1) + " year is " + (scoreAvg / totalCourseCnt));
                    break;
                case 3:
                    double bestScore = 0;
                    for (int i = 0; i < yearToStore; i++) {
                        for (int j = 0; j < totalCourseCnt; j++) {
                            if (bestScore < scores[i][j]) {
                                bestScore = scores[i][j];
                            }
                        }
                    }
                    System.out.println("the bast score is " + bestScore);
                    break;
                case 4:
                    System.out.println("请输入课程编号:");
                    int score = in.nextInt();
                    if (score <= 0 || score > totalCourseCnt) {
                        System.out.println("非法输入" + score);
                        exitFlag = false;
                        break;
                    }
                    double scoreBest = 0;
                    for (int i = 0; i < yearToStore; i++) {
                        if (scoreBest < scores[i][score]) {
                            scoreBest = scores[i][score];
                        }
                    }
                    System.out.println(score + " this course best score is " + scoreBest);
                    break;
                default:
                    exitFlag = false;
                    System.out.println("不支持程序结束 option" + option);
            }
        }
    }
}
