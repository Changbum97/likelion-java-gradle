package CodeUp.HomeWork_1017;

import java.util.Scanner;

public class p1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        x *= sc.nextLong();
        x *= sc.nextLong();

        double y = (double)x / (8.0 * 1024 * 1024);

        System.out.printf("%.2f MB", y);

    }
}
