package Programmers.heap;

import java.util.PriorityQueue;

/**
 * 프로그래머스 더 맵게
 */
public class MoreSpicy {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
    static class Solution {
        public int solution(int[] scovills, int K) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i = 0 ; i < scovills.length ; i ++) {
                pq.add(scovills[i]);
            }

            int answer = 0;
            while(pq.peek() < K) {
                if(pq.size() == 1) {
                    return -1;
                }
                int a = pq.poll();
                int b = pq.poll();
                pq.add(a + (2 * b));
                answer ++;
            }
            return answer;
        }
    }
}
