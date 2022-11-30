package Programmers.exercise;

/**
 * 프로그래머스 약수의 합
 */
public class SumOfDivisor {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(12));
        System.out.println(s.solution(5));
    }
    static class Solution {
        public int solution(int n) {
            int answer = 0;

            for(int i = 1 ; i <= n ; i ++) {
                if(n % i == 0) {
                    answer += i;
                }
            }

            return answer;
        }
    }
}
