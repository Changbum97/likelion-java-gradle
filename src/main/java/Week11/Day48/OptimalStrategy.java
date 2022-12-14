package Week11.Day48;

public class OptimalStrategy {
    public static void main(String[] args) {
        int[] coins = new int[]{2, 7, 40, 19};
        int n = coins.length;

        Pair[][] dp = new Pair[n][n];

        for (int i = 1; i < coins.length ; i++) {
            for (int j = 0; j < coins.length - i; j++) {
                int coinLeft = coins[j];
                int coinRight = coins[j+i];
                dp[i][j] = new Pair(coinLeft, coinRight);
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
