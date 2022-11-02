package Programmers.greedy;

import java.util.Arrays;

/**
 * 모의 고사
 */
public class PrepairTest {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString( s.solution(new int[]{1, 2, 3, 4, 5, 1, 2, 3}) ));
        System.out.println(Arrays.toString( s.solution(new int[]{1, 3, 2, 4, 2}) ));
    }

    static class Solution {
        public int[] solution(int[] answers) {
            /*
                1번 => 1, 2, 3, 4, 5 반복
                2번 => 2, 1, 2, 3, 2, 4, 2, 5 반복
                3번 => 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 반복
             */
            int n = 3;

            int[][] patterns = new int[][]{
                    {1, 2, 3, 4, 5},
                    {2, 1, 2, 3, 2, 4, 2, 5},
                    {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
            };

            int[] cnt = new int[n];

            for(int i = 0 ; i < answers.length ; i ++) {
                for(int j = 0 ; j < n ; j ++) {
                    if(answers[i] == patterns[j][i % patterns[j].length]) {
                        cnt[j] ++;
                    }
                }
            }

            int max = -1;
            for(int i = 0 ; i < n ; i ++) {
                max = Math.max(max, cnt[i]);
            }

            int ansSize = 0;
            for(int i = 0 ; i < n ; i ++) {
                if(max == cnt[i]) ansSize ++;
            }

            int[] answer = new int[ansSize];
            int ansIdx = 0;
            for(int i = 0 ; i < n; i ++) {
                if(max == cnt[i]) {
                    answer[ansIdx ++] = i + 1;
                }
            }

            return answer;
        }
    }
}
