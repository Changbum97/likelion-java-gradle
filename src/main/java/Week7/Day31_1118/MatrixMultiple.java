package Week7.Day31_1118;

import java.util.Arrays;

public class MatrixMultiple {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}});
        s.solution(new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}, new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}});

    }

    static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            // (a * b 행렬) * (b * c 행렬) => (a * c 행렬)
            int a = arr1.length;
            int b = arr1[0].length;
            int c = arr2[0].length;

            int[][] answer = new int[a][c];
            for(int i = 0 ; i < a ; i ++) {
                for(int j = 0 ; j < c ; j ++) {
                    int sum = 0;
                    for(int l = 0 ; l < b ; l ++) {
                        sum += arr1[i][l] * arr2[l][j];
                    }
                    answer[i][j] = sum;
                }
            }

            return answer;
        }
    }
}
