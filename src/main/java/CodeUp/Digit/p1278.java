package CodeUp.Digit;

import java.util.Scanner;

public class p1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 1;

        while(n >= 10) {
            n /= 10;
            digit ++;
        }

        System.out.println(digit);
    }
}
