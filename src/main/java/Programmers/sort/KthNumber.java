package Programmers.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 프로그래머스 K번째수
 */
public class KthNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] ans = solution.solution(array, commands);
        System.out.println( Arrays.toString(ans) );
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
