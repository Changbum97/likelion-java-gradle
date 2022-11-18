package Programmers.exercise;

/**
 * 프로그래머스 시저 암호
 */
public class CaesarCipher {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("AB", 1));
        System.out.println(s.solution("z", 1));
        System.out.println(s.solution("a B z", 4));
    }

    static class Solution {
        public String solution(String s, int n) {
            String answer = "";

            for(int i = 0 ; i < s.length() ; i ++) {
                char c = s.charAt(i);

                if(c == ' ') {
                    answer += ' ';
                } else if(c >= 'a' && c <= 'z') {
                    int x = (c - 'a' + n) % 26;
                    answer += (char)('a' + x);
                } else {
                    int x = (c - 'A' + n) % 26;
                    answer += (char)('A' + x);
                }
            }

            return answer;
        }
    }
}
