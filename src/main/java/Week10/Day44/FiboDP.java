package Week10.Day44;

public class FiboDP {
    public static void main(String[] args) {
        int n = 10;
        long[] dp = new long[n + 1];
        dp[1] = 1;
        dp[2] = 1;

        for(int i = 3 ; i <= n ; i ++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);
    }
}