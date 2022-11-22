package CodeUp.Recursion;

import java.util.Scanner;

public class p1851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printStar(n);
    }
    static void printStar(int x) {
        if(x == 0) return;

        System.out.print("*");
        printStar(x - 1);
    }
}
