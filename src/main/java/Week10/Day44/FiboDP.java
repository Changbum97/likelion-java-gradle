package Week10.Day44;

import java.util.Arrays;

public class FiboDP {
    static long[] dp;

    public static void main(String[] args) {
        int n = 50;
        dp = new long[n + 1];

        System.out.println(fibo(n));
    }

    static long fibo(int x) {
        if(x <= 1) {
            return 1;
        }

        if(dp[x] == 0) {
            dp[x] = fibo(x - 1) + fibo(x - 2);
        }

        return dp[x];
    }
}
