package Programmers.greedy;

public class PrepairTest {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(new int[]{1, 2, 3, 4, 5}));
        System.out.println(s.solution(new int[]{1, 3, 2, 4, 2}));
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

            int aIdx = 0, bIdx = 0, cIdx = 0;
            int aCnt = 0, bCnt = 0, cCnt = 0;

            for(int i = 0 ; i < answers.length ; i ++) {
                if(answers[i] == arr[aIdx]) aCnt ++;
                if(answers[i] == brr[bIdx]) bCnt ++;
                if(answers[i] == crr[cIdx]) cCnt ++;

                aIdx ++; bIdx ++; cIdx ++;


            }
        }
    }
}
