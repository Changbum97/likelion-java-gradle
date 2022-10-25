package Programmers.bracket;

import java.util.Scanner;

/**
 * 프로그래머스 올바른 괄호
 */
public class CorrectBracket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println( solution.solution(sc.nextLine()) );
    }

    static class Solution {
        boolean solution(String s) {
            boolean answer = true;

            int open = 0;
            for(int i = 0 ; i < s.length() ; i ++) {
                if(s.charAt(i) == '(') {
                    open ++;
                } else {
                    open --;
                    if(open == -1) {
                        answer = false;
                        break;
                    }
                }
            }
            if(open != 0) {
                answer = false;
            }

            return answer;
        }
    }
}
