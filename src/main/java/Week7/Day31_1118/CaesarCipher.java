package Week7.Day31_1118;

public class CaesarCipher {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("AB", 1));
        System.out.println(s.solution("z", 1));
        System.out.println(s.solution("a B z", 4));
    }

    static class Solution {
        public String solution(String s, int n) {
            char[] chars = s.toCharArray();

            for(int i = 1 ; i <= n ; i ++) {
                for(int j = 0 ; j < chars.length ; j ++) {

                    if( chars[j] == ' ') {
                        continue;
                    } else if(chars[j] == 'Z') {
                        chars[j] = 'A';
                    } else if(chars[j] == 'z') {
                        chars[j] = 'a';
                    } else {
                        chars[j] ++;
                    }

                }
            }

            return String.valueOf(chars);
        }
    }
}
