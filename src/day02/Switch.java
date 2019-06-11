package day02;

public class Switch {
    public static void main(String[] args) {
        int n = 1;
        String str = n + "对应的中文数字是 :";
        //if
        if (n == 1) {
            str += "一";
        } else if (n == 2) {
            str += "二";
        } else {
            System.out.println("error");
        }
        System.out.println(str);

        // switch
        str = n + "对应的中文数字是 :";

        switch (n) {   // switch 必须用int比较值
            case 1:
                str += "一";
                break;
            case 2:
                str += "二";
                break;   //每个case必须带上break
            default:
                System.out.println("error");
        }
        System.out.println(str);


    }

}

