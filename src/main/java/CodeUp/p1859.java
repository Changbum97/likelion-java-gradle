package CodeUp;

import java.util.Scanner;

public class p1859 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1, 1, n);
    }

    static void print(int x, int y, int n) {
        if(x > n) return;

        if(y > x) {
            System.out.println();
            print(x + 1, 1, n);
        } else {
            System.out.print("*");
            print(x, y + 1, n);
        }
    }
}
