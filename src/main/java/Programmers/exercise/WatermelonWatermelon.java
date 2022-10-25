package Programmers.exercise;

/**
 * 프로그래머스 수박수박수박수박수박수?
 */
public class WatermelonWatermelon {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println( s.solution(3).equals("수박수") );
        System.out.println( s.solution(4).equals("수박수박") );
    }

    static class Solution {
        public String solution(int n) {
            String answer = "";
            for(int i = 1 ; i <= n ; i ++) {
                if(i % 2 == 1) {
                    answer += "수";
                } else {
                    answer += "박";
                }
            }
            return answer;
        }
    }
}
