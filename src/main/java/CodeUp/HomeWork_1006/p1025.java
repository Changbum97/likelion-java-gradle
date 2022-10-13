package CodeUp.HomeWork_1006;

import java.util.Scanner;

public class p1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int digit = 10000;
        for(int i = 0 ; i < 5 ; i ++) {
            System.out.printf("[%d]\n", (x / digit) * digit);
            x %= digit;
            digit /= 10;
        }
    }
}
