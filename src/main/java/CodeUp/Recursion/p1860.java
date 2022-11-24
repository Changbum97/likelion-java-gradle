package CodeUp.Recursion;

import java.util.Scanner;

public class p1860 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(1, 1, n);
    }

    static void printNum(int i, int j, int n) {
        if(i > n) return;

        if(j == i) {
            System.out.println(j);
            printNum(i + 1, 1, n);
        } else {
            System.out.print(j + " ");
            printNum(i, j + 1 , n);
        }
    }
}
