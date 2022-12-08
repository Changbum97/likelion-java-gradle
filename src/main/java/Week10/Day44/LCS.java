package Week10.Day44;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA";
        String str2 = "DCABDC";

        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1 ; i <= n ; i ++) {
            for(int j = 1 ; j <= m ; j ++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}
