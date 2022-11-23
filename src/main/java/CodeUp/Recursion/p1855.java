package CodeUp.Recursion;

import java.util.Scanner;

public class p1855 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }
    static int fibonacci(int x) {
        if(x <= 2) return 1;

        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}
