package CodeUp.Recursion;

import java.util.Scanner;

public class p1925 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        if(r < n - r) r = n - r;

        long ans = factorial(r + 1, n);
        ans /= factorial(1, n - r);

        System.out.println(ans);
    }
    static long factorial(int x, int end) {
        if(x == end) return x;

        return x * factorial(x + 1, end);
    }
}
