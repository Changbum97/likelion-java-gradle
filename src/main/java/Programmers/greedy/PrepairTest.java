package Programmers.greedy;

import java.util.Arrays;

public class PrepairTest {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString( s.solution(new int[]{1, 2, 3, 4, 5, 1, 2, 3}) ));
        System.out.println(Arrays.toString( s.solution(new int[]{1, 3, 2, 4, 2}) ));
    }

    static class Solution {
        public int[] solution(int[] answers) {
            /*
                1번 => 1, 2, 3, 4, 5 반복
                2번 => 2, 1, 2, 3, 2, 4, 2, 5 반복
                3번 => 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 반복
             */
            int[] arr = new int[]{1, 2, 3, 4, 5};
            int[] brr = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
            int[] crr = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5 ,6};

            int aCnt = 0, bCnt = 0, cCnt = 0;

            for(int i = 0 ; i < answers.length ; i ++) {
                if(answers[i] == arr[i % arr.length]) aCnt ++;
                if(answers[i] == brr[i % brr.length]) bCnt ++;
                if(answers[i] == crr[i % crr.length]) cCnt ++;
            }

            int max = Math.max(aCnt, bCnt);
            max = Math.max(max, cCnt);

            int ansSize = 0;
            if(max == aCnt) ansSize ++;
            if(max == bCnt) ansSize ++;
            if(max == cCnt) ansSize ++;

            int[] answer = new int[ansSize];
            int ansIdx = 0;
            if(max == aCnt) answer[ansIdx ++] = 1;
            if(max == bCnt) answer[ansIdx ++] = 2;
            if(max == cCnt) answer[ansIdx ++] = 3;

            return answer;
        }
    }
}
