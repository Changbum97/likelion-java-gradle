package Programmers.stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 프로그래머스 같은 숫자는 싫어
 */
public class notsamenumber_list {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(s.solution(new int[]{4, 4, 4, 3, 3})));
    }

    static class Solution {
        public int[] solution(int[] arr) {
            List<Integer> answerList = new ArrayList<>();
            answerList.add(arr[0]);

            for(int i = 1 ; i < arr.length ; i ++) {
                if(answerList.get( answerList.size() - 1 ) != arr[i]) {
                    answerList.add(arr[i]);
                }
            }

            int[] answer = new int[answerList.size()];
            int idx = 0;
            for(int num : answerList) {
                answer[idx ++] = num;
            }
            return answer;
        }
    }
}
