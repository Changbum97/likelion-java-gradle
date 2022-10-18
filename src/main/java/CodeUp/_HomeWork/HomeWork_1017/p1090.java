package CodeUp._HomeWork.HomeWork_1017;

import java.util.Scanner;

public class p1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for(int i = 1 ; i < c ; i ++) {
            a *= b;
        }
        System.out.println(a);
    }
}
