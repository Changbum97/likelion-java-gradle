package Week11.Day46;

public class MinCostPath {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 3, 2}, {4, 6, 2}, {1, 2, 4}};
        int n = arr.length;

        // 3 * 3 DP 배열 선언
        int[][] dp = new int[n][n];

        // 첫번째 칸
        dp[0][0] = arr[0][0];

        // 첫번째 행
        for(int i = 1 ; i < n ; i ++) {
            dp[0][i] = arr[0][i] + dp[0][i - 1];
        }

        // 첫번째 열
        for(int i = 1 ; i < n ; i ++) {
            dp[i][0] = arr[i][0] + arr[i - 1][0];
        }

        // 나머지
        for(int i = 1 ; i < n ; i ++) {
            for(int j = 1 ; j < n ; j ++) {
                int min = Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
                min = Math.min(min, dp[i][j - 1]);

                dp[i][j] = arr[i][j] + min;
            }
        }
        System.out.println(dp[n - 1][n - 1]);
    }
}
