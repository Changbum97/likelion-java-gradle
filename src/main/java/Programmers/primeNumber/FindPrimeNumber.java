package Programmers.primeNumber;

import java.util.Arrays;

/**
 * 프로그래머스 소수 찾기
 */
// 에라토스테네스의 체
public class FindPrimeNumber {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
        System.out.println(s.solution(5));
        System.out.println(s.solution(50));
    }

    static class Solution {
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
