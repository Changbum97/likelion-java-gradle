package Programmers.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 프로그래머스 폰켓몬
 */
public class Ponketmon {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3, 1, 2, 3}));
        System.out.println(s.solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(s.solution(new int[]{3, 3, 3, 2, 2, 2}));

    }
    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            Set<Integer> set = new HashSet<>();

            for(int num : nums) {
                set.add(num);
            }

            answer = Math.min(set.size(), nums.length/2);
            return answer;
        }
    }
}
