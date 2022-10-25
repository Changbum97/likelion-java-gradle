package Programmers.codingTestBasic;

import java.util.Scanner;

/**
 * 프로그래머스 자릿수 더하기
 */
public class AddAllDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution solution = new Solution();
        System.out.println( solution.solution(n) );
    }

    static class Solution {
        public int solution(int n) {
            int sum = 0;

            while(n != 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }
}
