package CodeUp.Recursion;

import java.util.Scanner;

public class p1904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        printOddNumber(start, end);
    }
    static void printOddNumber(int num, int end) {
        if(num > end) return;

        if(num % 2 == 1) {
            System.out.print(num + " ");
        }
        printOddNumber(num + 1, end);
    }
}
