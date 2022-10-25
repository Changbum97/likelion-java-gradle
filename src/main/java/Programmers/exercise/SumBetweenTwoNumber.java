package Programmers.exercise;

import java.util.Scanner;

/**
 * 프로그래머스 두 정수 사이의 합
 */
public class SumBetweenTwoNumber {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println( solution.solution(3, 5) == 12 );
        System.out.println( solution.solution(3, 3) == 3 );
        System.out.println( solution.solution(5, 3) == 12 );
    }

    static class Solution {
        public long solution(int a, int b) {
            if(b < a) {
                int temp = b;
                b = a;
                a = temp;
            }

            long answer = 0;
            for(int i = a ; i <= b ; i ++) {
                answer += i;
            }
            return answer;
        }
    }
}
