package CodeUp.FindMax;

import java.util.Scanner;

public class p4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int x = 0, y = 0;

        for(int i = 1 ; i <= 9 ; i ++) {
            for(int j = 1 ; j <= 9 ; j ++) {
                int num = sc.nextInt();
                if(max < num) {
                    max = num;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
