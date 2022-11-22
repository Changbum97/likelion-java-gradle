package CodeUp.Recursion;

import java.util.Scanner;

public class p1854 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(sum(n));
    }
    static int sum(long x) {
        if(x == 0) return 0;
        return (int)(x % 10) + sum(x / 10);
    }
}
