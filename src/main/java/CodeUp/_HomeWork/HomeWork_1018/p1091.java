package CodeUp._HomeWork.HomeWork_1018;

import java.util.Scanner;

public class p1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        for(int i = 1 ; i < d ; i ++) {
            a = (a * b) + c;
        }

        System.out.println(a);
    }
}
