package CodeUp.FindMax;

import java.util.Scanner;

public class p2081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 1 ; i <= 9 ; i ++) {
            int x = sc.nextInt();
            if(max < x) {
                max = x;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
