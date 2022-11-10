package Programmers.stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class NotSameNumber_stack {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(s.solution(new int[]{4, 4, 4, 3, 3})));
    }

    static class Solution {
        public int[] solution(int[] arr) {
            Stack<Integer> answerStack = new Stack<>();
            answerStack.push(arr[0]);

            for(int i = 1 ; i < arr.length ; i ++) {
                if(answerStack.peek() != arr[i]) {
                    answerStack.push(arr[i]);
                }
            }

            int[] answer = new int[answerStack.size()];
            int idx = answerStack.size();
            while(!answerStack.isEmpty()) {
                answer[-- idx] = answerStack.pop();
            }
            return answer;
        }
    }
}
