package Week5.Day21_1102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// 에라토스테네스의 체
public class RemoveMultipleOf {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(50));
        System.out.println(s.solution(10));
        System.out.println(s.solution(5));
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
