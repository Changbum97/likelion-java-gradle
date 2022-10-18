package CodeUp._HomeWork.HomeWork_1018;

import java.util.Scanner;

public class p1099 {
    static int n = 10;
    static int[][] arr = new int[n][n];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < n ; i ++) {
            for(int j = 0 ; j < n ; j ++) {
                arr[i][j] = sc.nextInt();
            }
        }

        find(1, 1);

        for(int i = 0 ; i < n ; i ++) {
            for(int j = 0 ; j < n ; j ++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void find(int x, int y) {
        // 먹이를 찾은 경우
        if(arr[x][y] == 2) {
            arr[x][y] = 9;
            return;
        }

        arr[x][y] = 9;

        // 길이 막힌 경우
        if(arr[x][y + 1] == 1 && arr[x + 1][y] == 1) {
            return;
        }

        if(arr[x][y + 1] != 1) {
            find(x, y + 1);
        } else if(arr[x + 1][y] != 1) {
            find(x + 1, y);
        }
    }
}
