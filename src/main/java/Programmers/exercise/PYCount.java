package Programmers.exercise;

public class PYCount {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("pPoooyY"));
        System.out.println(s.solution("Pyy"));
    }
    static class Solution {
        boolean solution(String s) {
            int pCount = 0;
            int yCount = 0;

            for(int i = 0 ; i < s.length() ; i ++) {
                if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                    pCount ++;
                } else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                    yCount ++;
                }
            }

            if (pCount == yCount) return true;
            return false;
        }
    }
}
