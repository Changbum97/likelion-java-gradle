package Week5.Day21_1102;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Solution1 s1 = new Solution1();
        System.out.println(s1.isPrimeNumber(47));
        System.out.println(s1.isPrimeNumber(50));

        System.out.println(s1.solution(10));
        System.out.println(s1.solution(50));

        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(10));
        System.out.println(s2.solution(50));

        // 시간 비교
        long startTime, endTime;

        startTime = System.currentTimeMillis();
        s1.solution(10000000);   // 1000만
        endTime = System.currentTimeMillis();
        System.out.println("걸린 시간 : " + (double)(endTime - startTime) / 1000 + " 초");

        startTime = System.currentTimeMillis();
        s2.solution(10000000);   // 1000만
        endTime = System.currentTimeMillis();
        System.out.println("걸린 시간 : " + (double)(endTime - startTime) / 1000 + " 초");
    }


    // isPrimeNumer 사용
    static class Solution1 {

        public boolean isPrimeNumber(int num) {
            int end = (int)Math.sqrt(num);
            for(int i = 2 ; i <= end ; i ++) {
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public int solution(int num) {
            int ans = 0;

            for(int i = 2 ; i <= num ; i ++) {
                if(isPrimeNumber(i)) ans ++;
            }

            return ans;
        }
    }

    // 에라토스테네스의 체 사용
    static class Solution2 {
        public int solution(int n) {
            int answer = 0;

            boolean[] isPrime = new boolean[n + 1];
            Arrays.fill(isPrime, true);

            for(int i = 2 ; i <= n ; i ++) {
                if(isPrime[i] == false) continue;

                answer ++;
                for(int j = i * 2 ; j <= n ; j += i) {
                    isPrime[j] = false;
                }
            }

            return answer;
        }
    }

}
