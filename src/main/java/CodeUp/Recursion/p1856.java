package CodeUp.Recursion;

import java.util.Scanner;

public class p1856 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(stair(n));
    }
    static int stair(int x) {
        if(x <= 0) return 0;
        if(x == 1) return 1;
        if(x == 2) return 2;
        if(x == 3) return 4;

        return stair(x - 1) + stair(x - 2) + stair(x - 3);
    }
}
