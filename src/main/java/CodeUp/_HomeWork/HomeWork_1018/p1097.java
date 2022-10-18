package CodeUp._HomeWork.HomeWork_1018;

import java.util.Scanner;

public class p1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[][] arr = new int[20][20];

        for(int i = 1 ; i <= 19 ; i ++) {
            for(int j = 1 ; j <= 19 ; j ++) {
                arr[i][j] = sc.nextInt();
            }
        }

        n = sc.nextInt();
        for(int i = 0 ; i < n ; i ++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = 1 ; j<= 19 ; j ++) {
                arr[x][j] = 1 - arr[x][j];
                arr[j][y] = 1 - arr[j][y];
            }
        }

        for(int i = 1 ; i <= 19 ; i ++) {
            for(int j = 1 ; j <= 19 ; j ++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
