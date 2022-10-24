package Week4.Day14_1024;

import java.util.Arrays;

public class KthNumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int x = 1;
        int y = 3;
        int[] brr = Arrays.copyOfRange(array, x, y);
        System.out.println(Arrays.toString(brr));

        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(array, commands)));
    }

    static class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] ans = new int[commands.length];
            int ansIdx = 0;

            for(int[] command : commands) {
                int[] sliceArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);
                Arrays.sort(sliceArray);
                ans[ansIdx ++] = sliceArray[command[2] - 1];
            }

            return ans;
        }
    }
}
