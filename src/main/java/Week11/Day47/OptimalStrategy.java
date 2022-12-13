package Week11.Day47;

public class OptimalStrategy {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 40, 19};
        int n = arr.length;

        int[][] sumUntil = new int[n][n];
        for(int i = 0 ; i < n ; i ++) {
            for(int j = i ; j < n ; j ++) {
                if(j == 0) {
                    sumUntil[i][j] = arr[j];
                } else {
                    sumUntil[i][j] = sumUntil[i][j - 1] + arr[j];
                }
            }
        }

        for(int i = 0 ; i < n ; i ++) {
            for(int j = 0 ; j < n ; j ++) {
                System.out.print(sumUntil[i][j] + " ");
            }
            System.out.println();
        }



        Pair[][] dp = new Pair[n][n];

        for(int i = 0 ; i < n ; i ++) {
            dp[i][i] = new Pair(arr[i], 0);
        }

        for(int i = 0 ; i < n - 1 ; i ++) {
            int j = i + 1;
            if(arr[i] > arr[j]) {
                dp[i][j] = new Pair(arr[i], arr[j]);
            } else {
                dp[i][j] = new Pair(arr[j], arr[i]);
            }
        }

        for(int i = 0 ; i < n ; i ++) {
            for(int j = 0 ; j < n ; j ++) {
                if(dp[i][j] == null) {
                    System.out.print("(0, 0)  ");
                } else {
                    System.out.printf("(%d, %d)  ", dp[i][j].x, dp[i][j].y);
                }
            }
            System.out.println();
        }
    }

    static class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
