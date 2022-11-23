package CodeUp.Recursion;

import java.util.Scanner;

public class p1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
    static int factorial(int x) {
        if(x == 1) return 1;
        return x * factorial(x - 1);
    }
}
