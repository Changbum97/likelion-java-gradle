package Programmers.exercise;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 프로그래머스 명예의 전당
 */
public class hallOfFame {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
        System.out.println(Arrays.toString(s.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
    }

    static class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i = 0 ; i < score.length ; i ++) {
                if(pq.size() == k) {
                    if(pq.peek() < score[i]) {
                        pq.poll();
                        pq.add(score[i]);
                    }
                } else {
                    pq.add(score[i]);
                }

                answer[i] = pq.peek();
            }

            return answer;
        }
    }
}
