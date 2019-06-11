package day02;

public class MultiTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            String line = "";
            for (int j = 1; j <= i; j++) {
                line += i + " * " + j + " = " + (i * j) + "\t";
            }
            System.out.println(line);
        }
    }
}
