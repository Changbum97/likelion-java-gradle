package CodeUp._HomeWork.HomeWork_1018;

import java.util.Scanner;

public class p1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[x + 1][y + 1];

        for(int i = 0 ; i < n ; i ++) {
            int length = sc.nextInt();
            int direction = sc.nextInt();
            int startX = sc.nextInt();
            int startY = sc.nextInt();

            if(direction == 0) {
                // 가로
                for(int j = startY ; j < startY + length ; j ++) {
                  arr[startX][j] = 1;
                }
            } else {
                // 세로
                for(int j = startX ; j < startX + length ; j ++) {
                    arr[j][startY] = 1;
                }
            }
        }

        for(int i = 1 ; i <= x ; i ++) {
            for(int j = 1 ; j <= y ; j ++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
