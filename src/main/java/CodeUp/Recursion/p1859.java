package CodeUp.Recursion;

import java.util.Scanner;

public class p1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStar(1, 1, n);
    }

    static void printStar(int i, int j, int n) {
        if(i > n) return;

        if(j == i) {
            System.out.println("*");
            printStar(i + 1, 1, n);
        } else {
            System.out.print("*");
            printStar(i, j + 1 , n);
        }
    }
}
