package Week6.Day22_1107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArray {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(s.solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(s.solution(new int[]{3, 2, 6}, 10)));
    }

    static class Solution {
        public int[] solution(int[] arr, int divisor) {
            List<Integer> answerList = new ArrayList<>();
            for(int i = 0 ; i < arr.length ; i ++) {
                if(arr[i] % divisor == 0) {
                    answerList.add(arr[i]);
                }
            }

            if (answerList.isEmpty()) {
                return new int[]{-1};
            } else {
                int[] answer = new int[answerList.size()];
                int idx = 0;

                for(int num : answerList) {
                    answer[idx ++] = num;
                }
                Arrays.sort(answer);
                return answer;
            }
        }
    }
}
