package day02;

import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的名字");
        String name = in.nextLine();
        System.out.println("请输入你的年龄");
        int age = in.nextInt();
        System.out.println(name + "你好，你的年龄为" + age);
    }

}
