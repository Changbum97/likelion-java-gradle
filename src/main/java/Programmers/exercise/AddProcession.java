package Programmers.exercise;

import java.util.Arrays;

/**
 * 프로그래머스 행렬의 덧셈
 */
public class AddProcession {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] ans = s.solution(new int[][]{{1, 2},{2, 3}}, new int[][]{{3, 4},{5, 6}});
        System.out.println(Arrays.toString(ans[0]));
        System.out.println(Arrays.toString(ans[1]));
    }
    static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int x = arr1.length;
            int y = arr1[0].length;
            int[][] answer = new int[x][y];

            for(int i = 0 ; i < x ; i ++) {
                for(int j = 0 ; j < y ; j ++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            return answer;
        }
    }
}
