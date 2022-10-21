package CodeUp.BasicHomeWork.HomeWork_1018;

import java.util.Scanner;

public class p1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[20][20];

        for(int i = 0 ; i < n ; i ++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x][y] = 1;
        }

        for(int i = 1 ; i <= 19 ; i ++) {
            for(int j = 1 ; j <= 19 ; j ++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
