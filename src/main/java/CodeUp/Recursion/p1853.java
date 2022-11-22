package CodeUp.Recursion;

import java.util.Scanner;

public class p1853 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    static int sum(int x) {
        if(x == 1) return 1;
        return x + sum(x - 1);
    }
}
