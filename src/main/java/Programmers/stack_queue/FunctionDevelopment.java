package Programmers.stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 프로그래머스 기능개발
 */
public class FunctionDevelopment {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(s.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(s.solution(new int[]{90, 90, 90}, new int[]{1, 1, 1})));
    }

    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            int n = progresses.length;

            List<Integer> answerList = new ArrayList<>();
            int workDate = calculate(progresses[0], speeds[0]);
            int cnt = 1;

            for(int i = 1 ; i < n ; i ++) {
                if(workDate >= calculate(progresses[i], speeds[i])) {
                    // 전에 작업에서 배포
                    cnt ++;
                } else {
                    // 이전까지 작업 개수 삽입, 작업 기간 갱신
                    answerList.add(cnt);
                    cnt = 1;
                    workDate = calculate(progresses[i], speeds[i]);
                }
            }
            answerList.add(cnt);

            int[] answer = new int[answerList.size()];
            for(int i = 0 ; i < answerList.size() ; i ++) {
                answer[i] = answerList.get(i);
            }

            return answer;
        }

        public int calculate(int x, int y) {
            int ans = (100 - x) / y;
            if( (100 - x) % y != 0) ans ++;
            return ans;
        }
    }
}