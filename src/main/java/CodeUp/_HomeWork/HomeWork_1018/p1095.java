package CodeUp._HomeWork.HomeWork_1018;

import java.util.Scanner;

public class p1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 24;

        for(int i = 0 ; i < n ; i ++) {
            int x = sc.nextInt();
            if(min > x) {
                min = x;
            }
        }

        System.out.println(min);
    }
}
